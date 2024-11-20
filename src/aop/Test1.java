package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        SamplesAcceptanceDepartment samplesAcceptanceDepartment = context.getBean(SamplesAcceptanceDepartment.class);
        samplesAcceptanceDepartment.registerApplication();
        context.close();
    }
}
