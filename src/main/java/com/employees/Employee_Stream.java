package com.employees;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee_Stream {
    String name;
    int salary;
    String region;
    int age;

    public Employee_Stream(String name, int salary, String region, int age) {
        this.name=name;
        this.salary=salary;
        this.region=region;
        this.age=age;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Employee_Stream> list = new ArrayList<Employee_Stream>();

        //Adding employees
        list.add(new Employee_Stream("Jade", 10000, "Bangalore", 24));
        list.add(new Employee_Stream("Judy", 11000, "Delhi", 25));
        list.add(new Employee_Stream("Dexter", 20000, "Mumbai", 26));
        list.add(new Employee_Stream("Suzy", 23000, "Delhi", 22));
        list.add(new Employee_Stream("Lex", 5000, "Bangalore", 34));
        list.add(new Employee_Stream("John", 45000, "Delhi", 33));
        list.add(new Employee_Stream("Danish", 25000, "Bangalore", 32));
        list.add(new Employee_Stream("Dinesh", 32000, "Bangalore", 30));
        list.add(new Employee_Stream("Rajesh", 48000, "Mumbai", 27));

        //salary greater than 11000
        List<Employee_Stream> salary2=list.stream()
                .filter(p->p.salary>11000)
                .collect(Collectors.toList());

        list.forEach(x-> System.out.println(x.name));

        List<Employee_Stream> employeeList = list.stream()
                .filter(x->x.salary>30000)
                .filter(x->x.region=="Bangalore")
                .collect(Collectors.toList());
        list.forEach(x->System.out.println(x.name));
    }

}