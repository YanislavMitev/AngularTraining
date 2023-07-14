package com.yani.designpatterns.behavioral.memento;

/**
 * Client.
 * <a href="https://app.pluralsight.com/course-player?clipId=3d131d61-b26c-4d03-87e3-8c00b437eab7">Pluralsight link </a>
 */
public class MementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee employee = new Employee();
        employee.setName("Ivan");
        employee.setPhone("0891248671");
        employee.setAddress("Sofia, Lyulin");

        System.out.println("Employee before save: " + employee);

        caretaker.save(employee);

        employee.setPhone("0891715192");
        caretaker.save(employee);

        System.out.println("Employee after save: " + employee);

        employee.setPhone("0891157197");

        caretaker.revert(employee);
        System.out.println("Employee after revert to last saved point: " + employee);

        caretaker.revert(employee);
        System.out.println("Employee after revert to original: " + employee);
    }
}
