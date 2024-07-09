package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 28, 50000),
                new Employee("Bob", 35, 60000),
                new Employee("Charlie", 40, 70000),
                new Employee("David", 25, 45000)
        );

        double averageSalaryOfEmployeesOver30 = employees.stream()
                .filter(employee -> employee.getAge() > 30)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println(averageSalaryOfEmployeesOver30);
    }
}
