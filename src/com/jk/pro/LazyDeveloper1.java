package com.jk.pro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LazyDeveloper1
{
    public static void main(String[] args)
    {
      List<String> words=Arrays.asList("a","e","i","o","u","Jee","Jeevan","Champions","NammaRcb","Kohli");
     List<String> result= words.stream()
              .filter(s->s.length()>3)
              .map(String::toUpperCase)
              .collect(Collectors.toList());
     System.out.println(result);
    }
}
