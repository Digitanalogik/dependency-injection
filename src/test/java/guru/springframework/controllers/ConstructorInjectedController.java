package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedController {

    private ConstructorIndectedController constructorIndectedController;

    @Before
    public  void setUp() throws Exception {
        this.constructorIndectedController = new ConstructorIndectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorIndectedController.sayHello());
    }
}
