package com.yani.designpatterns.lambda.consumers;

public class DemoConsumers {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println("Consumer 1: " + s);
        Consumer<String> consumer2 = s -> System.out.println("Consumer 2: " + s);

        // without chaining
        Consumer<String> consumer3 = s -> {
            consumer.accept(s);
            consumer2.accept(s);
        };

        consumer3.accept("Hello");

        System.out.println("-----------------------");

        // with chaining
        consumer3 = consumer.andThen(consumer2);
        consumer3.accept("Hello");

        // handling NULLs
        // the idea here is to apply Objects.requireNonNull(...) to the passed argument
        // so we can have clue which consumer exactly called the andThen(...) method
        // otherwise we will get the exception in the lambda, and we can't get to know
        // which consumer called it
        consumer3 = consumer.andThen(null);
        consumer3.accept("Hello");
    }
}
