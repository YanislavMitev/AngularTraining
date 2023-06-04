package com.yani.designpatterns.creational.singleton;

/**
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=4b9930d3-8e43-4a44-92c7-592b2a4e6357</a>
 */
public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton instance2 = DbSingleton.getInstance();

        System.out.println("Instance 1: " + instance);
        System.out.println("Instance 2: " + instance2);
        System.out.println("Is it singleton? " + (instance == instance2 ? "Yes" : "No"));
    }
}
