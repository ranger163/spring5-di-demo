package me.inassar.didemo.services.impl;

import me.inassar.didemo.services.interfaces.IGreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Ahmed Nassar.
 * Date: 15 May, 2020
 */
@Service
@Primary
public class PrimaryGreetingServiceImpl implements IGreetingService {
    @Override
    public String sayGreetings() {
        return "Hello - Primary Greeting service!";
    }
}