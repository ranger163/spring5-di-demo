package me.inassar.didemo.services.impl;

import me.inassar.didemo.services.interfaces.IGreetingRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Ahmed Nassar.
 * Date: 15 May, 2020
 * Time: 5:15 PM
 */
@Component
public class GreetingRepoImpl implements IGreetingRepo {
    @Override
    public String getEnglishGreetings() {
        return "Hello - Primary Greeting service!";
    }

    @Override
    public String getArabicGreetings() {
        return "مرحباً بك في خدمة التحيات الأساسية";
    }

    @Override
    public String getSpanishGreetings() {
        return "Holla - Servicio de Saludo Primario";
    }
}