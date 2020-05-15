package me.inassar.didemo;

import me.inassar.didemo.controllers.PropertyInjectedController;
import me.inassar.didemo.services.impl.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController controller;

    @Before
    public void setUp() {
        this.controller = new PropertyInjectedController();
        this.controller.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreetings() {
        assertEquals(GreetingServiceImpl.HELLO_NASSAR,controller.sayHello());
    }
}
