package me.inassar.didemo.services.impl;

import me.inassar.didemo.services.interfaces.IGreetingRepo;
import me.inassar.didemo.services.interfaces.IGreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ahmed Nassar.
 * Date: 15 May, 2020
 * Time: 4:54 PM
 */
@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingServiceImpl implements IGreetingService {

    private IGreetingRepo repo;

    public PrimarySpanishGreetingServiceImpl(IGreetingRepo repo) {
        this.repo = repo;
    }

    @Override
    public String sayGreetings() {
        return repo.getSpanishGreetings();
    }
}