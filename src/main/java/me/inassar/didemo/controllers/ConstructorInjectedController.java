package me.inassar.didemo.controllers;

import me.inassar.didemo.services.interfaces.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private IGreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreetings();
    }
}
