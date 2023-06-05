package com.yani.designpatterns.structural.flyweight;

/**
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=65297029-061a-4c33-9c0a-b1efb3542d94</a>
 */
public class FlyweightInventoryDemo {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Roomba", 221);
        inventorySystem.takeOrder("Bose Headphones", 361);
        inventorySystem.takeOrder("Samsung TV", 432);
        inventorySystem.takeOrder("Samsung TV", 323);
        inventorySystem.takeOrder("Roomba", 563);
        inventorySystem.takeOrder("Bose Headphones", 321);
        inventorySystem.takeOrder("Roomba", 234);
        inventorySystem.takeOrder("Samsung TV", 54);
        inventorySystem.takeOrder("Roomba", 34);
        inventorySystem.takeOrder("Bose Headphones", 365);
        inventorySystem.takeOrder("Samsung TV", 332);
        inventorySystem.takeOrder("Roomba", 456);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }
}
