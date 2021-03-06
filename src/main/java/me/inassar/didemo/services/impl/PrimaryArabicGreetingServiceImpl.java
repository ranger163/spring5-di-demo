package me.inassar.didemo.services.impl;

import me.inassar.didemo.services.interfaces.GreetingRepository;
import me.inassar.didemo.services.interfaces.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ahmed Nassar.
 * Date: 15 May, 2020
 * Time: 4:44 PM
 */
@Service
@Primary
@Profile("ar")
public class PrimaryArabicGreetingServiceImpl implements GreetingService {

    private GreetingRepository repo;

    public PrimaryArabicGreetingServiceImpl(GreetingRepository repo) {
        this.repo = repo;
    }

    @Override
    public String sayGreetings() {
        return repo.getArabicGreetings();
    }
}