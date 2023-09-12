package wesley.learning.springdependencyinjectionlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import wesley.learning.springdependencyinjectionlearning.services.GreetingService;
@Controller
public class PropertyIjectedController {
    @Autowired
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
