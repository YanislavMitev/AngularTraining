package com.yani.designpatterns.behavioral.iterator;

import java.util.Iterator;

/**
 * Client.
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=29842eab-6943-48e6-ae43-73ca4420eeed</a>
 */
public class IteratorDemo {
    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();
        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        Iterator<String> bikeIterator = repo.iterator();

        while(bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

        System.out.println("---------------------");

        for (String bike : repo) {
            System.out.println(bike);
        }
    }
}
