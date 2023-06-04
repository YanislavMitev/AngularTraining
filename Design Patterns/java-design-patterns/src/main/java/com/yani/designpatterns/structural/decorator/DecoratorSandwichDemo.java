package com.yani.designpatterns.structural.decorator;

/**
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=52f15858-5ebd-4746-9439-64446ce35234</a>
 */
public class DecoratorSandwichDemo {
    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
