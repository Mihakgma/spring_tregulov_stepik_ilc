package spring_introduction;

//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("singleton")
//@Scope("prototype")
public class Dog implements Pet {
    Dog() {
        System.out.println(this.getClass().getSimpleName() + " has been created");
    }

    @Override
    public void say() {
        System.out.println("Bow-bow");
    }
    @PostConstruct
    public void init() {
        System.out.println(this.getClass().getSimpleName() + " is initialized");
    }
    @PreDestroy
    private void destroy() {
        System.out.println("For class" + this.getClass().getSimpleName() + "Destroy method is called");
    }
}
