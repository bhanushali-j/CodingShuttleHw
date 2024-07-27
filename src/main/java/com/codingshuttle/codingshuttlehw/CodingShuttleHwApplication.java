package com.codingshuttle.codingshuttlehw;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingShuttleHwApplication implements CommandLineRunner {

    private final CakeBaker cakeBaker;

    CodingShuttleHwApplication(CakeBaker cakeBaker) {
        this.cakeBaker = cakeBaker;
    }

    public static void main(String[] args) {
        SpringApplication.run(CodingShuttleHwApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        cakeBaker.bakeCake();
    }
}
