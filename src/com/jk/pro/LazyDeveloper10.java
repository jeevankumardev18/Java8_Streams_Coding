package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyDeveloper10
{
    public static void main(String[] args)
    {
        List<String> skills = Arrays.asList("Java", "Spring Boot", "Microservices");


        String joinedSkills=skills
                .stream()
                .collect(Collectors.joining(", "));

        System.out.println(joinedSkills);
    }
}
