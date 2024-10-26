package com.imran.iterator;

public class EmployeesIterator<T> implements  Iterator<T> {
    private final Employees<T> employees;
    private int currentIndex = 0;

    EmployeesIterator(Employees<T> employees){
        this.employees = employees;
    }
    @Override
    public boolean hasNext() {
        return currentIndex < employees.getSize();
    }

    @Override
    public void next() {
        if(!hasNext()){
            throw new IndexOutOfBoundsException("No more employees to iterate");
        }
       currentIndex ++;
    }

    @Override
    public T current() {
        return employees.getEmployees().get(currentIndex);
    }

}
