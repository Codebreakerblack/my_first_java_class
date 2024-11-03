package dev.mariel.my_first_java_class;

public class Person {
    private String firstName;
    private String lastName;
    private String idNumber;
    private int birthYear;
    private String countryOfBirth;
    private char gender;


    public Person(String firstName, String lastName, String idNumber, int birthYear, String countryOfBirth, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
    }
    
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getIdNumber() {return idNumber;}
    public int getBirthYear() {return birthYear;}
    public String getCountryOfBirth() {return countryOfBirth;}
    public char getGender() {return gender;}
    
    public void print() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Country of Birth: " + countryOfBirth);
        System.out.println("Gender: " + gender);
    }


}
