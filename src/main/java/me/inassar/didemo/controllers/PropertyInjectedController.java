package me.inassar.didemo.controllers;

import me.inassar.didemo.services.interfaces.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public IGreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreetings();
    }

}
