package com.jk.pro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class User
{
   int id;
   String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class LazyDeveloper16
{
    public static void main(String[] args)
    {
       List<User> users= Arrays.asList(
               new User(1,"Jeevan"),
                new User(2,"Akashara"),
                new User(3,"Virat"));

      List<User> list = users
               .stream()
               .sorted(Comparator.comparing(User::getName))
               .collect(Collectors.toList());

        System.out.println(list);
    }
}
