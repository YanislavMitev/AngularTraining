package com.yani.designpatterns.behavioral.state;

/**
 * Client.
 * <a href="https://app.pluralsight.com/course-player?clipId=043e82cd-6e4a-40b3-8efd-ef7752b80990">Pluralsight link </a>
 */
public class StateDemo {
    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);
    }
}
