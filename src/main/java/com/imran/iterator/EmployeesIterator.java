package com.imran.iterator;

public class EmployeesIterator implements EmployeeIterator{
    private Employees employees;
    private int currentIndex = 0;
    EmployeesIterator(Employees employees){
        this.employees = employees;
    }
    @Override
    public boolean hasNext() {
        return currentIndex < employees.getSize();
    }

    @Override
    public String next() {
        if(!hasNext()){
            throw new IndexOutOfBoundsException("No more employees to iterate");
        }
        return employees.getEmployees()[currentIndex++];
    }

}
