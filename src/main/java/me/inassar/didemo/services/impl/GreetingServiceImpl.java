package me.inassar.didemo.services.impl;

import me.inassar.didemo.services.interfaces.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_NASSAR = "Hello Nassar!! - Original";

    @Override
    public String sayGreetings() {
        return HELLO_NASSAR;
    }
}
