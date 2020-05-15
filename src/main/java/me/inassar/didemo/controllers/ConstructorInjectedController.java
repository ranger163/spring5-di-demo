package me.inassar.didemo.controllers;

import me.inassar.didemo.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private IGreetingService greetingService;

    public ConstructorInjectedController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreetings();
    }
}
