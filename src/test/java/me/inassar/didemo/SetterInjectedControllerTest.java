package me.inassar.didemo;

import me.inassar.didemo.controllers.SetterInjectedController;
import me.inassar.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @Before
    public void setUp() {
        this.controller = new SetterInjectedController();
        this.controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() {
        assertEquals(GreetingServiceImpl.HELLO_NASSAR, controller.sayHello());
    }

}
