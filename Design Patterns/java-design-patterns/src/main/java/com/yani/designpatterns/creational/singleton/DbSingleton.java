package com.yani.designpatterns.creational.singleton;

/**
 * Pluralsight link <a>https://app.pluralsight.com/paths/skills/design-patterns-in-java</a>
 */
public class DbSingleton {
    // using volatile to ensure thread safety
    private static volatile DbSingleton instance;

    private DbSingleton() {
        if (instance != null) {
            // thread safe
            // blocks object creation with reflection
            throw new RuntimeException("Use getInstance() method to create!");
        }
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            // thread safe
            synchronized (DbSingleton.class) {
                // Lazy loaded
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }
}
