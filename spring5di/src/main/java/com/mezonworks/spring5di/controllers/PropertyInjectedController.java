package com.mezonworks.spring5di.controllers;

import com.mezonworks.spring5di.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
