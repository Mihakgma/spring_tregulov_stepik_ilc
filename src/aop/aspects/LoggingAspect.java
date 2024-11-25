package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    // before invoicing of the method...
    @Before("execution(public void getOperators())")
    public void beforeRegisterApplicationAdvice(JoinPoint joinPoint) {
        System.out.println("Before Registering Application");
    }
    // After invoicing method...
    @After("execution(public void getOperators())")
    public void afterRegisterApplicationAdvice(JoinPoint joinPoint) {
        System.out.println("After Registering Application");
    }
}
