package com.springconfigureation.beanconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import Controller.MyController;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"Controller", "Service"})
//@ComponentScan(basePackages = "Controller")
public class BeanconfigurationApplication {


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BeanconfigurationApplication.class, args);
        MyController myController = context.getBean(MyController.class);
        myController.show();
    }
}

