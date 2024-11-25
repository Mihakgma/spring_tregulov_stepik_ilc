package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("department")
public class Department {
    private List<Operator> operators = new ArrayList<>();

    public void addOperators() {
        Operator operator1 = new Operator("Vasya Vasin", 1, 23000.9);
        Operator operator2 = new Operator("Petya Petin", 2, 13000.1);
        Operator operator3 = new Operator("Ivan Ivanov", 3, 59000.7);
        operators.add(operator1);
        operators.add(operator2);
        operators.add(operator3);
    }
    public List<Operator> getOperators() {
        System.out.println("Information about operators:");
        for (Operator operator : operators) {
            System.out.println(operator);
        }
        return operators;
    }
}
