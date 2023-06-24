package com.example.pruebaform;


import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(WebConfig.class)
public class PruebaFormApplication {

    public static void main(String[] args) {
        SpringApplication.run(PruebaFormApplication.class, args);
    }

}