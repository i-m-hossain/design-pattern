package com.imran.iterator;

import java.util.ArrayList;
import java.util.List;

public class Employees<T> {
    private final List<T> employees = new ArrayList<>();



    // Pops the last element from the stack
    public T pop() {
        if (!employees.isEmpty()) {
            return employees.remove(employees.size() - 1);
        }
        return null; // Or throw an exception if preferred
    }

    // Pushes a new employee onto the stack
    public void push(T person) {
        employees.add(person);
    }


    // Returns the current employees in the stack
    public List<T> getEmployees() {
        return new ArrayList<>(employees); // Return a copy for safety
    }

    // Returns the size of the employee array
    public int getSize() {
        return employees.size();
    }

    // Method to return an iterator
    public Iterator<T> createIterator() {
        return new EmployeesIterator<>(this);
    }
}
