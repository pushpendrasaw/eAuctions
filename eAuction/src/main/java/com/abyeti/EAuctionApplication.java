package com.abyeti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "com.abyeti")
@EnableAutoConfiguration
public class EAuctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(EAuctionApplication.class, args);
    }
}
