package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        if(person.isTeen()) System.out.println("I am teen.");
        else System.out.println("I am not teen.");

        Person otherPerson = new Person("Jonathan", "Travis", 16);

        System.out.println("Firstname: " + otherPerson.getFirstName());

        System.out.println("LastName: " + otherPerson.getLastName());

        System.out.println("Age: " + otherPerson.getAge());

        if(otherPerson.isTeen()) System.out.println("I am teen.");
        else System.out.println("I am not teen.");
    }
}
