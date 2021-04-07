package com.mezonworks.spring5di;

import com.mezonworks.spring5di.controllers.ConstructorInjectedController;
import com.mezonworks.spring5di.controllers.MyController;
import com.mezonworks.spring5di.controllers.PropertyInjectedController;
import com.mezonworks.spring5di.controllers.SetterInjectedController;
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
    }

}
