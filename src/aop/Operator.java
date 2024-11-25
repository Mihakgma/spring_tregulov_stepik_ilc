package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("operator")
public class Operator extends Personnel {

    public Operator(String nameSurname, int departmentId, double salary) {
        super(nameSurname, departmentId, salary);
    }
}
