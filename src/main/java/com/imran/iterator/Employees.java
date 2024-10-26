package com.imran.iterator;

public class Employees {
    private final String[] employees = new String[10]; // Fixed size of 10
    private int size = 0; // To keep track of the number of elements in the array

    // Pops the last element from the stack
    public String pop() {
        if (size > 0) {
            String lastEmployee = employees[size - 1]; // Get the last element
            employees[size - 1] = null; // Remove it by setting to null
            size--; // Decrease the size
            return lastEmployee;
        }
        return null; // Or throw an exception if preferred
    }

    // Pushes a new employee onto the stack
    public void push(String person) {
        if (size < employees.length) {
            employees[size] = person; // Add at the current size index
            size++; // Increase the size
        } else {
            System.out.println("Stack is full. Cannot add more employees.");
        }
    }

    // Returns the current employees in the stack
    public String[] getEmployees() {
        String[] currentEmployees = new String[size]; // Create a new array to hold actual employees
        System.arraycopy(employees, 0, currentEmployees, 0, size); // Copy only the filled part
        return currentEmployees;
    }

    // Returns the size of the employee array
    public int getSize() {
        return size;
    }

    // Method to return an iterator
    public EmployeeIterator createIterator() {
        return new EmployeesIterator(this);
    }
}
