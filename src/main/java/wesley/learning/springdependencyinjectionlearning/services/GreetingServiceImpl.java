package wesley.learning.springdependencyinjectionlearning.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Everyone from base service";
    }
}
