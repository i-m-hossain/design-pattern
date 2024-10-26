package com.imran.iterator;

public class Main {
    public static void main(String[] args) {
        Employees employees = new Employees();

        employees.push("Imran");
        employees.push("Saiful");
        employees.push("Jamil");
        employees.push("Shovon");

        // Using the iterator to traverse the employees
        EmployeeIterator iterator = employees.createIterator();

        System.out.println("Employees in the stack:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Popping the last employee
        System.out.println("Last employee popped: " + employees.pop());

        // Iterating again to see the remaining employees
        System.out.println("Employees after popping:");
        iterator = employees.createIterator(); // Reset the iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
