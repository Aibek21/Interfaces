package com.company;


public class ShallowCopy {

    public static void main(String[] args) {

        //Original Object

        Person person = new Person("Person-A", "Civic");

        System.out.println("Original : " + person.getN() + " - "


                + person.getC().getN());


        //Clone as a shallow copy

        Person person2 = (Person) person.clone();


        System.out.println("Clone (before change): " + person2.getN() + " - "


                + person2.getC().getN());


        //change the primitive member

        person2.setN("Person-B");


        //change the lower-level object

        person2.getC().setN("Accord");


        System.out.println("Clone (after change): " + person2.getN() + " - "


                + person2.getC().getN());


        System.out.println("Original (after clone is modified): " + person.getN()


                + " - " + person.getC().getN());

    }
}

class Person implements Cloneable {
    //Lower-level object

    private Car carObject;
    private String name;

    public Car getC() {

        return carObject;
    }

    public String getN() {

        return name;
    }

    public void setN(String s) {

        name = s;
    }

    public Person(String s, String t) {

        name = s;

        carObject = new Car(t);
    }

    @Override
    public Object clone() {

        //shallow copy

        try {


            return super.clone();

        } catch (CloneNotSupportedException e) {


            return null;

        }
    }
}

class Car {

    private String carName;

    public String getN() {

        return carName;
    }

    public void setN(String s) {

        carName = s;
    }

    public Car(String s) {

        carName = s;
    }
}