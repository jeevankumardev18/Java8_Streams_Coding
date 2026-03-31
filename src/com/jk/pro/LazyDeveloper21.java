package com.jk.pro;

import java.util.*;
import java.util.stream.Collectors;

public class LazyDeveloper21
{
    public static void main(String[] args)
    {
       List<Employee> emps= Arrays.asList(new Employee("Jeevan",30000,"IT"),
                new Employee("Ravana",80000,"IT"),
        new Employee("Mohan",45000,"IT"),
        new Employee("kritisanan",28000,"HR"));



       Map<String,Optional<Employee>> topEmpByDept=emps
               .stream()
               .collect(Collectors.groupingBy(Employee::getDepartment,
                       Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        topEmpByDept.forEach((s,e)-> System.out.println(s + " -> " + e));
    }
}
