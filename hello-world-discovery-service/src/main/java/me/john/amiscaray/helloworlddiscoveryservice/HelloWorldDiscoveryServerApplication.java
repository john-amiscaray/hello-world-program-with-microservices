package me.john.amiscaray.helloworlddiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HelloWorldDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldDiscoveryServerApplication.class, args);
    }

}
