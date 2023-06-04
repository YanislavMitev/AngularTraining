package com.yani.designpatterns.structural.composite;

/**
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=2800c8b8-ee0d-4396-94db-4a318d86d0ee</a>
 */
public class CompositeMenuDemo {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu);
    }
}
