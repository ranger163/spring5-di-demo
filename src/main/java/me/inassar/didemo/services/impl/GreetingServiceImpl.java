package me.inassar.didemo.services.impl;

import me.inassar.didemo.services.interfaces.IGreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements IGreetingService {

    public static final String HELLO_NASSAR = "Hello Nassar!!";

    @Override
    public String sayGreetings() {
        return HELLO_NASSAR;
    }
}
