package com.employees;

import java.util.ArrayList;
import java.util.List;
public class Employee {
    String name;
    int salary;
    String region;
    int age;
    float avg;

    public Employee(String name, int salary, int age, String region) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.region = region;
    }

    // Highest salary
     static int show(List<Employee> list) {
        System.out.print("The highest salary is: ");
        int i = 0;
        for (Employee v : list) {
            if (i < v.salary) {
                i = v.salary;
            }
        }
        return i;
    }

    // Lowest salary
    static int show2(List<Employee> list) {
        System.out.print("The lowest salary is: ");
        int i = Integer.MAX_VALUE;
        for (Employee v : list) {
            if (i > v.salary) {
                i = v.salary;
            }

        }
        return i;
    }

    // Find average salary
    static float show3(List<Employee> list) {
        float avg, sum = 0;
        int no_of_employee = list.size();
        for (Employee v : list) {
            sum += v.salary;
        }
        System.out.print("The Average salary is: ");
        avg = ((float) sum / no_of_employee);
        return avg;
    }

    // Find greater and lower than Average salary
    static void show4(List<Employee> list, float avg) {
        List<Integer> greater_salary = new ArrayList<Integer>();
        List<Integer> lower_salary = new ArrayList<Integer>();
        for (Employee v : list) {
            if (avg < v.salary) {
                greater_salary.add(v.salary);
            } else if (avg > v.salary) {
                lower_salary.add(v.salary);
            }
        }
        System.out.print("Salary greater than average salary is: ");
        for (Integer sal : greater_salary) {
            System.out.print("\t" + sal);
        }
        System.out.print("\nSalary lower than average salary is: ");
        for (Integer sal : lower_salary) {
            System.out.print("\t" + sal);
        }
    }

    // Name the employees whose age is greater than 30
    static void show5(List<Employee> list) {
        List<String> names = new ArrayList<String>();
        for (Employee v : list) {
            if (30 < v.age) {
                names.add(v.name);
            }
        }
        System.out.print("\nName of Employee whose age is greater than 30 : ");
        for (String name : names) {
            System.out.print("\n" + name);
        }
    }

    // Name the employees whose belong to one particular region
    static void show6(List<Employee> list) {
        List<String> names = new ArrayList<String>();
        for (Employee v : list) {
            if ("Bangalore" == v.region) {
                names.add(v.name);
            }
        }
        System.out.print("\nName of Employee whose belong to one particular region :");
        for (String name : names) {
            System.out.print("\n" + name);
        }
    }

    // Name of Employee whose name start with 'J'
    static void show7(List<Employee> list) {
        List<String> names = new ArrayList<String>();
        for (Employee v : list) {
            if ('J' == v.name.charAt(0)) {
                names.add(v.name);
            }
        }
        System.out.print("\nName of Employee whose name start with 'J' :");
        for (String name : names) {
            System.out.print("\n" + name);
        }
    }

    // Name the Employee whose age is less than 30 and the region is Bangalore
    static void show8(List<Employee> list) {
        List<String> names = new ArrayList<String>();
        for (Employee v : list) {
            if (30 > v.age && "Bangalore" == v.region) {
                names.add(v.name);
            }
        }
        System.out.print("\nName of Employee whose age is less than 30 and the region is Bangalore : ");
        for (String name : names) {
            System.out.print("\n" + name);
        }
    }

    // Find Name of Employee whose length of name is more than 5
    static void show9(List<Employee> list) {
        List<String> names = new ArrayList<String>();
        for (Employee v : list) {
            if (5 < v.name.length()) {
                names.add(v.name);
            }
        }
        System.out.print("\nName of Employee whose length of name is more than 5: ");
        for (String name : names) {
            System.out.print("\n" + name);
        }
    }

    // Name of Employee whose length of salary is greater then 11000
    static void show10(List<Employee> list) {
        List<String> names = new ArrayList<String>();
        for (Employee v : list) {
            if (11000 < v.salary) {
                names.add(v.name);
            }
        }
        System.out.print("\nName of Employee whose length of salary is greater then 11000: ");
        for (String name : names) {
            System.out.print("\n" + name);
        }
    }

    // Find 2nd Character of name of Employee
    static void show11(List<Employee> list) {
        List<Character> characters = new ArrayList<Character>();
        for (Employee v : list) {
            characters.add(v.name.charAt(1));
        }
        System.out.print("\n2nd Character's of name of Employee: ");
        for (char character : characters) {
            System.out.print("\n" + character);
        }
    }

    public static void main(String args[]) {
        float avg;
        List<Employee> list = new ArrayList<Employee>();

        // Adding the employees to the list
        list.add(new Employee("Jade", 10000, 24, "Bangalore"));
        list.add(new Employee("Judy", 11000, 25, "Delhi"));
        list.add(new Employee("Dexter", 20000, 26, "Mumbai"));
        list.add(new Employee("Suzy", 23000, 22, "Delhi"));
        list.add(new Employee("Lex", 5000, 34, "Bangalore"));
        list.add(new Employee("John", 45000, 33, "Delhi"));
        list.add(new Employee("Danish", 25000, 32, "Bangalore"));
        list.add(new Employee("Dinesh", 32000, 30, "Bangalore"));
        list.add(new Employee("Rajesh", 48000, 27, "Mumbai"));

        // Finding the highest salary

        System.out.println(show(list));

        System.out.println(show2(list));

        System.out.println(show3(list));

//        System.out.println(show4(list));

//        show4(list);

        show5(list);
        show6(list);
        show7(list);
        show8(list);
        show9(list);
        show10(list);
        show11(list);

    }
}
