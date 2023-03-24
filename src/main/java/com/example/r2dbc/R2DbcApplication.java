package com.example.r2dbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

@SpringBootApplication
@EnableR2dbcAuditing
public class R2DbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(R2DbcApplication.class, args);
    }

}
