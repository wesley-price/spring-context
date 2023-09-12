package wesley.learning.springdependencyinjectionlearning.controller;

import wesley.learning.springdependencyinjectionlearning.services.GreetingService;

public class PropertyIjectedController {
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
