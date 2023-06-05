package com.yani.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Catalog acts as a factory and cache for Item flyweight objects
 */
public class Catalog {
    private Map<String, Item> items = new HashMap<>();

    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            Item newItem = new Item(itemName);

            items.put(itemName, newItem);

            return newItem;
        }

        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
