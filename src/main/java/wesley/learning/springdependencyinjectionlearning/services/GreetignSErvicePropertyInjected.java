package wesley.learning.springdependencyinjectionlearning.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetignSErvicePropertyInjected  implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Friends don't let friends do property Injection!!!";
    }
}
