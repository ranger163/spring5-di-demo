package me.inassar.didemo.controllers;

import me.inassar.didemo.services.interfaces.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService service;

    public MyController(GreetingService service) {
        this.service = service;
    }

    public String hello() {
        System.out.println("Hello!!!");
        return service.sayGreetings();
    }
}
