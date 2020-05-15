package me.inassar.didemo.controllers;

import me.inassar.didemo.services.interfaces.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private IGreetingService service;

    public MyController(IGreetingService service) {
        this.service = service;
    }

    public String hello() {
        System.out.println("Hello!!!");
        return service.sayGreetings();
    }
}
