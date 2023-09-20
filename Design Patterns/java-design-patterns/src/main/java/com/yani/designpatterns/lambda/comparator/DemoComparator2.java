package com.yani.designpatterns.lambda.comparator;

import java.util.function.Function;

public class DemoComparator2 {
    public static void main(String[] args) {
        Person mary = new Person("Mary", 28);
        Person terry = new Person("Terry", 22);
        Person linda = new Person("Linda", 26);
        Person james = new Person("James", 32);
        Person jamesBis = new Person("James", 23);

        Function<Person, String> getName = Person::getName;
        Function<Person, Integer> getAge = Person::getAge;

        Comparator<Person> cmpName = Comparator.comparing(getName);
        Comparator<Person> cmpAge = Comparator.comparing(getAge);

        Comparator<Person> combined = Comparator.comparing(getName)
                                                .thenComparing(getAge);

        System.out.println("Compare alphabetically");
        System.out.println("------------------------");
        System.out.println("Mary > Terry: " + (cmpName.compare(mary, terry) > 0));
        System.out.println("Terry > James: " + (cmpName.compare(terry, james) > 0));
        System.out.println("Linda > Terry: " + (cmpName.compare(linda, terry) > 0));

        System.out.println();
        System.out.println("Compare by age");
        System.out.println("------------------------");
        System.out.println("Mary > Terry: " + (cmpAge.compare(mary, terry) > 0));
        System.out.println("Terry > James: " + (cmpAge.compare(terry, james) > 0));
        System.out.println("Linda > Terry: " + (cmpAge.compare(linda, terry) > 0));

        System.out.println("Compare combined");
        System.out.println("------------------------");
        System.out.println("Mary > Terry: " + (combined.compare(mary, terry) > 0));
        System.out.println("Terry > James: " + (combined.compare(terry, james) > 0));
        System.out.println("Linda > Terry: " + (combined.compare(linda, terry) > 0));
        System.out.println("James > James Bis: " + (combined.compare(james, jamesBis) > 0));
    }
}
