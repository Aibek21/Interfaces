package com.company;

public class Employee implements
        Runnable, Cloneable, Comparable {

    int a;
    int b;


    @Override
    public void run() {
        //realization
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("Employee");
        Employee employee = (Employee) o;
        if (a > employee.a) return 1;
        else if (a < employee.a) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Employee " + a;
    }
}
