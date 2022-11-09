package guru.springframework.sfgdi.services;


public class PropertyInjectedService implements GreetingService{
    @Override
    public String sayGreeting() {

        return "Hello World - Property";
    }
}
