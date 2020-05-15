package me.inassar.didemo.controllers;

import me.inassar.didemo.services.interfaces.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private IGreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreetings();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingServiceImpl") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
