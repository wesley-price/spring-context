package wesley.learning.springdependencyinjectionlearning.controller;

import org.springframework.stereotype.Controller;
import wesley.learning.springdependencyinjectionlearning.services.GreetingService;
import wesley.learning.springdependencyinjectionlearning.services.GreetingServiceImpl;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
