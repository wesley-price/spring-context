package wesley.learning.springdependencyinjectionlearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import wesley.learning.springdependencyinjectionlearning.services.GreetingService;

@Controller
public class SetterInjectedController {
    @Autowired
    @Qualifier("setterGreetingBean")
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
