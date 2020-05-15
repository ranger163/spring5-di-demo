package me.inassar.didemo.services.impl;

import me.inassar.didemo.services.interfaces.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello - I was injected by the setter";
    }
}
