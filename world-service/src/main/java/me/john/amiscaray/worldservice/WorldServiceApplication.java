package me.john.amiscaray.worldservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WorldServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorldServiceApplication.class, args);
    }

}
