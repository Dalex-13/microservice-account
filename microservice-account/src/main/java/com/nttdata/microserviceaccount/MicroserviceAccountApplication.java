package com.nttdata.microserviceaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceAccountApplication.class, args);
    }

}
