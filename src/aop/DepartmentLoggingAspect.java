package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DepartmentLoggingAspect {
    @Before("execution(* getOperators())")
    public void beforeExecution() {
        System.out.println("Logging getting operators" +
                "\nBefore execution of ");
    }
    @AfterReturning("execution(* getOperators())")
    public void afterReturningExecution() {
        System.out.println("Logging getting operators" +
                "\nAfter Returning execution of ");
    }
}
