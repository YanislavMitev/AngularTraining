package com.yani.designpatterns.lambda.comparator;

import java.util.function.Function;

public class DemoComparator {
    public static void main(String[] args) {
        Person mary = new Person("Mary", 28);
        Person terry = new Person("Terry", 22);
        Person linda = new Person("Linda", 26);
        Person james = new Person("James", 32);

        Comparator<Person> nameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());

        System.out.println("Mary > Terry: " + (nameComparator.compare(mary, terry) > 0));
        System.out.println("Terry > James: " + (nameComparator.compare(terry, james) > 0));
        System.out.println("Linda > Terry: " + (nameComparator.compare(linda, terry) > 0));

        // Second way
        System.out.println("----------------------------");
        // Second way

        Function<Person, String> getName = p -> p.getName();
        Comparator<Person> nameComparator2 = Comparator.comparing(getName);

        System.out.println("Mary > Terry: " + (nameComparator2.compare(mary, terry) > 0));
        System.out.println("Terry > James: " + (nameComparator2.compare(terry, james) > 0));
        System.out.println("Linda > Terry: " + (nameComparator2.compare(linda, terry) > 0));

        // Negating
        System.out.println("----------------------------");
        // Negating

        Comparator<Person> nameComparatorReversed = Comparator.comparing(getName).reversed();
        System.out.println("Mary > Terry: " + (nameComparatorReversed.compare(mary, terry) > 0));
        System.out.println("Terry > James: " + (nameComparatorReversed.compare(terry, james) > 0));
        System.out.println("Linda > Terry: " + (nameComparatorReversed.compare(linda, terry) > 0));
    }
}
