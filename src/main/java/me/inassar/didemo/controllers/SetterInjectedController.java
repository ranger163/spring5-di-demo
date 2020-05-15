package me.inassar.didemo.controllers;

import me.inassar.didemo.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private IGreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }

    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
