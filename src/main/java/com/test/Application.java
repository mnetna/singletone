package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);

        String test = "";
        if(CoreUtils.getStringUtil().isEmpty(test)) {
            System.out.println("test의 값은 null입니다.");
        }
    }
}
