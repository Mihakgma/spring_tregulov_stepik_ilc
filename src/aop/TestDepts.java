package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestDepts {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Department department = context.getBean("department", Department.class);
        department.addOperators();
        List<Operator> operators = department.getOperators();
        for (Operator operator : operators) {
            System.out.println(operator);
            context.close();
        }
    }
}
