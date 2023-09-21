package src.main.java.Lessons.Equality;


import java.util.ArrayList;
import java.util.List;

import src.main.java.Workbooks.Workbooks_7_1.Person;

public class Main {
    public static void main(String[] args) {

        City paris = new City("Paris", 2161000);
 
        List<City> cities = new ArrayList<>();
        cities.add(new City("London", 8982000));
        cities.add(new City("Versailles", 85771));
        cities.add(new City("Florence", 382258));
 
        System.out.println(cities.contains(paris));

        // ArrayList<City> cities = new ArrayList<>();
        // cities.add(new City("Paris", 2161000));
        // cities.add(new City("Florence", 382258));
        // cities.add(new City("Venice", 261905));
        // cities.add(new City("Versailles", 85771));
        // cities.add(new City("London", 8982000));
        
        //System.out.println(cities.contains(paris));
    }

}