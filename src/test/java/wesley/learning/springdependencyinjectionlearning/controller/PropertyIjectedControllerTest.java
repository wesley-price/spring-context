package wesley.learning.springdependencyinjectionlearning.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wesley.learning.springdependencyinjectionlearning.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyIjectedControllerTest {
    PropertyIjectedController propertyIjectedController;
    @BeforeEach
    void setUp() {
        propertyIjectedController = new PropertyIjectedController();
        propertyIjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(propertyIjectedController.sayHello());
    }
}