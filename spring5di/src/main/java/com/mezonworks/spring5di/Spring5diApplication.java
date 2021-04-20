package com.mezonworks.spring5di;

import com.mezonworks.spring5di.config.DiConfiguration;
import com.mezonworks.spring5di.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5diApplication {

    public static void main(String[] args) {
        ApplicationContext  context =  SpringApplication.run(Spring5diApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        System.out.println("-------- Primary Bean");
        System.out.println(myController.sayHello());

        System.out.println("-------- Property");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------- Setter");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------- Constructor");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("-------- Profile check");
        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        System.out.println("-------- Config Props Bean");
        DiConfiguration diConfiguration = context.getBean(DiConfiguration.class);
        System.out.println(diConfiguration.getUsername());
        System.out.println(diConfiguration.getPassword());
        System.out.println(diConfiguration.getJdbcUrl());
    }

}
