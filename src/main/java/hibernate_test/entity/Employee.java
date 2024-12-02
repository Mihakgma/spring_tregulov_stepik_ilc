package hibernate_test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "birth_date")
    private Date birth_date;

    @Column(name = "e_mail")
    private String e_mail;

    @Column(name = "department")
    private String department;

    @Column(name = "telephone_number")
    private String telephone_number;

    @Column(name = "salary")
    private double salary;

    @Column(name = "access_level")
    private int access_level;

    public Employee() {}

    public Employee(String name,
                    String surname,
                    String last_name,
                    Date birth_date,
                    String e_mail,
                    String department,
                    String telephone_number,
                    double salary,
                    int access_level) {
        this.name = name;
        this.surname = surname;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.e_mail = e_mail;
        this.department = department;
        this.telephone_number = telephone_number;
        this.salary = salary;
        this.access_level = access_level;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_date=" + birth_date +
                ", e_mail='" + e_mail + '\'' +
                ", department='" + department + '\'' +
                ", telephone_number='" + telephone_number + '\'' +
                ", salary=" + salary +
                ", access_level=" + access_level +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLast_name() {
        return last_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getDepartment() {
        return department;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public double getSalary() {
        return salary;
    }

    public int getAccess_level() {
        return access_level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAccess_level(int access_level) {
        this.access_level = access_level;
    }
}
