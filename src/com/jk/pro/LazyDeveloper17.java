package com.jk.pro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee1
{
   String department;
   double salary;

    public Employee1(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return department + " " + salary;
    }
}

public class LazyDeveloper17
{
    public static void main(String[] args)
    {
       List<Employee1> emps= Arrays.asList(new Employee1("It",34000),
                new Employee1("Hr",22000),
                new Employee1("It",54000));

          List<Employee1> list=emps
                  .stream()
                  .sorted(Comparator.comparing(Employee1::getDepartment)
                          .thenComparing(Comparator.comparing(Employee1::getSalary).reversed()))
                  .collect(Collectors.toList());

        System.out.println(list);





    }
}
