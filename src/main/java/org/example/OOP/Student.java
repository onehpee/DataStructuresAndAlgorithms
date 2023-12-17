package org.example.OOP;


public class Student {
    public String firstName;

    public String lastName;

    public static int age;
//    public Student(String firstName, String lastName){
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public Student(){
//
//    }
    @Override
    public String toString(){
        return firstName + " " +  lastName + " " + age;
    }
}

