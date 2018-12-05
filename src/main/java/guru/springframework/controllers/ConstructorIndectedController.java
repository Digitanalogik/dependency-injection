package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class ConstructorIndectedController {

    private GreetingService greetingService;

    public ConstructorIndectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }

}
