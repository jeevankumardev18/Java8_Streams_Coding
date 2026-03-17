package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyDeveloper7
{
    public static void main(String[] args)
    {
        List<String> codingLanguages=
                Arrays.asList("Java","Springboot","Microservices","Aws","ReactJs","Python");

        List<Integer> list=codingLanguages
                .stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
