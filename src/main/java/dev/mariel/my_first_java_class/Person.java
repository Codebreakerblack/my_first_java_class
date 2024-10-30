package dev.mariel.my_first_java_class;

public class Person {
    private String firstName;
    private String lastName;
    private String idNumber;
    private int birthYear;


    public Person(String firstName, String lastName, String idNumber, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
    }

    public void print() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Birth Year: " + birthYear);
    }

}
