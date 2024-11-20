package aop;

import org.springframework.stereotype.Component;

@Component("sampleAcceptDeptBean")
public class SamplesAcceptanceDepartment {

    public void registerApplication() {
        System.out.println("Application registered");
    }

}
