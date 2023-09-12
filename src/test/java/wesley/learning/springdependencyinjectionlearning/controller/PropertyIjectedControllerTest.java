package wesley.learning.springdependencyinjectionlearning.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wesley.learning.springdependencyinjectionlearning.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PropertyIjectedControllerTest {
    @Autowired
    PropertyIjectedController propertyIjectedController;
//    @BeforeEach
//    void setUp() {
//        propertyIjectedController = new PropertyIjectedController();
//        propertyIjectedController.greetingService = new GreetingServiceImpl();
//    }
    @Test
    void sayHello() {
        System.out.println(propertyIjectedController.sayHello());
    }
}