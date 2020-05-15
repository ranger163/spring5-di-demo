package me.inassar.didemo.controllers;

import me.inassar.didemo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreetings();
    }

}
