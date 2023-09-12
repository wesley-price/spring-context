package wesley.learning.springdependencyinjectionlearning.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wesley.learning.springdependencyinjectionlearning.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}