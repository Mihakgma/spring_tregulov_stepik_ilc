package aop;

import org.springframework.stereotype.Component;

@Component
public class Personnel {
    private String nameSurname;
    private int departmentId;
    private double salary;

    public Personnel(String nameSurname, int departmentId, double salary) {
        this.nameSurname = nameSurname;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Personnel {" +
                "nameSurname='" + nameSurname + '\'' +
                ", departmentId=" + departmentId +
                ", salary=" + salary +
                '}';
    }
}
