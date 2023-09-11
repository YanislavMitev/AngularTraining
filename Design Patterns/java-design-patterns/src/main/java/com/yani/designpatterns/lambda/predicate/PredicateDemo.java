package com.yani.designpatterns.lambda.predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> p1 = s -> s != null;
        Predicate<String> p2 = s -> !s.isEmpty();

        Predicate<String> p3 = p1.and(p2);
        // non-empty string
        System.out.println(
            "Is it non-empty? " + p3.test("Non-empty string")
        );

        // empty string
        System.out.println(
            "Is it non-empty? " + p3.test("")
        );

        // null string
        System.out.println(
            "Is it non-null? " + p3.test(null)
        );

//        null value for consumer passed to .and(...)
//        p3 = p1.and(null);
//        System.out.println(
//            p3.test("Hey")
//        );

        System.out.println("----------------------------");
        System.out.println("Creating P2 negate consumer");
        System.out.println("----------------------------");

        // Negating p2
        p2 = s -> s.isEmpty();
        Predicate<String> notP2 = p2.negate();

        p3 = p1.and(notP2);
        // non-empty string
        System.out.println(
            "Is it non-empty? " + p3.test("Non-empty string")
        );

        // empty string
        System.out.println(
            "Is it non-empty? " + p3.test("")
        );

        // null string
        System.out.println(
            "Is it non-null? " + p3.test(null)
        );

//        null value for consumer passed to .and(...)
//        p3 = p1.and(null);
//        System.out.println(
//            p3.test("Hey")
//        );
    }
}
