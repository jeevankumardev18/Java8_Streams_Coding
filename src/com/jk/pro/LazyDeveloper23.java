package com.jk.pro;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Developer
{
    String name;
    List<String> skills;

    public Developer(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public List<String> getSkills()
    {
        return skills;
    }
}

public class LazyDeveloper23
{
    public static void main(String[] args)
    {
        List<Developer> team = Arrays.asList(
                new Developer("Dev1", Arrays.asList("Java", "Spring Boot")),
                new Developer("Dev2", Arrays.asList("Java", "MySQL", "React")),
                new Developer("Dev3", Arrays.asList("Spring Boot", "Microservices", "AWS"))
        );


             List<String> uniqueSkills=team
                   .stream()
                   .flatMap(dev->dev.getSkills().stream())
                   .distinct()
                   .sorted()
                   .collect(Collectors.toList());

        System.out.println(uniqueSkills);
    }
}
