package me.john.amiscaray.helloworldclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {

    @Autowired
    private RestTemplate rest;

    @GetMapping("/")
    public String getHelloWorld(){

        String hello = rest.getForObject("http://hello-service/hello", String.class);
        String world = rest.getForObject("http://world-service/world", String.class);

        return hello + " " + world;

    }

}
