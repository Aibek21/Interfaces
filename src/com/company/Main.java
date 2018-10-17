package com.company;

public class Main {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.a = 1;
        e.b = 2;

        Employee e1 = new Employee();
        e1.a = 2;
        e1.b = 2;

        System.out.println(Max.max(e, e1));

//        try {
//            Employee copy = (Employee) e.clone();
//            copy.a = 10;
//            System.out.println(e.a + " " + e.b);
//            System.out.println(copy.a + " " + copy.b);
//        } catch (CloneNotSupportedException e1) {
//            e1.printStackTrace();
//        }
    }
}
