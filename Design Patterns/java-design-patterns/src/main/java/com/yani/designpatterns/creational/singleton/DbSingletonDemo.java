package com.yani.designpatterns.creational.singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton instance2 = DbSingleton.getInstance();

        System.out.println("Instance 1: " + instance);
        System.out.println("Instance 2: " + instance2);
        System.out.println("Is it singleton? " + (instance == instance2 ? "Yes" : "No"));
    }
}
