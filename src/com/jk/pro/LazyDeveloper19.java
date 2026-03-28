package com.jk.pro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Show
{
    private  int id;
    private String name;
    private double rating;

    public Show(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Show{name='" + name + "', rating=" + rating + "}";
    }
}



public class LazyDeveloper19
{
    public static void main(String[] args)
    {
        List<Show> shows=Arrays.asList(new Show(1,"StrangerThings",9.2),
                new Show(2,"FamilyMan",9.8),
                new Show(3,"MoneyHeist",9.2),
                new Show(4,"Pirates",8.8));

        Optional<Show> topRated=shows
                .stream()
                .max(Comparator.comparingDouble(Show::getRating));

        topRated.ifPresent(s->
                System.out.println("The Top Rated Show is: " + s.getName() +
                        " with a " + s.getRating() + " rating."));
    }
}
