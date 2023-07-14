package com.yani.designpatterns.behavioral.memento;

import java.util.Stack;

/**
 * Caretaker.
 */
public class Caretaker {
    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee employee) {
        if (employee != null) {
            employeeHistory.push(employee.save());
        }
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }
}
