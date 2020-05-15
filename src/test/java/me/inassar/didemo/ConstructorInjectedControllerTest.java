package me.inassar.didemo;

import me.inassar.didemo.controllers.ConstructorInjectedController;
import me.inassar.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @Before
    public void setUp(){
        this.controller=new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings(){
        assertEquals(GreetingServiceImpl.HELLO_NASSAR,controller.sayHello());
    }

}
