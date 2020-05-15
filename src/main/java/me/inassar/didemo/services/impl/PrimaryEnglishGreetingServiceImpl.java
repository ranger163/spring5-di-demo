package me.inassar.didemo.services.impl;

import me.inassar.didemo.services.interfaces.IGreetingRepo;
import me.inassar.didemo.services.interfaces.IGreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ahmed Nassar.
 * Date: 15 May, 2020
 */
@Service
@Primary
@Profile({"en","default"})
public class PrimaryEnglishGreetingServiceImpl implements IGreetingService {

    private IGreetingRepo repo;

    public PrimaryEnglishGreetingServiceImpl(IGreetingRepo repo) {
        this.repo = repo;
    }

    @Override
    public String sayGreetings() {
        return repo.getEnglishGreetings();
    }
}