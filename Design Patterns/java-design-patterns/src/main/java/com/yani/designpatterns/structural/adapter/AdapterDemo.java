package com.yani.designpatterns.structural.adapter;

import java.util.List;

/**
 * Pluralsight link <a>https://app.pluralsight.com/course-player?clipId=b0c4cab7-8525-4a29-bc73-11c10d36d489</a>
 */
public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}
