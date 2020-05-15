package me.inassar.didemo.services.impl;

import me.inassar.didemo.services.interfaces.IGreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements IGreetingService {
    @Override
    public String sayGreetings() {
        return "Hello - I was injected via the constructor";
    }
}
