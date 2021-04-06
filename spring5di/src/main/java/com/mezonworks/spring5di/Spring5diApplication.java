package com.mezonworks.spring5di;

import com.mezonworks.spring5di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5diApplication {

    public static void main(String[] args) {
        ApplicationContext  context =  SpringApplication.run(Spring5diApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");

        String greeting = myController.sayHello();
        System.out.println(greeting);
    }

}
