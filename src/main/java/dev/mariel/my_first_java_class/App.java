package dev.mariel.my_first_java_class;

public final class App {
    public static void main(String[] args) {
        Person person1 = new Person("Mariel", "Blanco", "123456", 1990, "Venezuela", 'M');
        Person person2 = new Person("Dany", "Longa", "654321", 1988, "Venezuela", 'H');

        person1.print();
        System.out.println();
        person2.print();
    }
}
