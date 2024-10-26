package com.imran.iterator;

import com.imran.iterator.Employees;
import com.imran.iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        Employees<String> employees = new Employees<>();
        employees.push("Imran");
        employees.push("Saiful");
        employees.push("Jamil");
        employees.push("Shovon");

        // Using the iterator to traverse employees
        Iterator<String> iterator = employees.createIterator();

        System.out.println("Employees in the stack:");
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }


    }
}
