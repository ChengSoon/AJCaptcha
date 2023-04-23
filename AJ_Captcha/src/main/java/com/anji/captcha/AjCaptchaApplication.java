package com.anji.captcha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.anji"})
public class AjCaptchaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AjCaptchaApplication.class, args);
    }

}
