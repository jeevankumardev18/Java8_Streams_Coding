package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    String name;
    double salary;
    String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

public class LazyDeveloper3
{
    public static void main(String[] args)
    {
       List<Employee> emps= Arrays.asList(new Employee("Jack",60000,"It"),
                new Employee("Riya",25000,"Hr"),
                new Employee("Jeevan",35000,"It"));

           List<String>  list= emps
                    .stream()
                    .filter(e->e.salary>50000)
                    .map(Employee::getName)
                    .collect(Collectors.toList());

        System.out.println(list);
    }
}
