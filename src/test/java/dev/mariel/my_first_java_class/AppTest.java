package dev.mariel.my_first_java_class;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class AppTest {
    @Test
    void testPersonAttributes() {
        Person person1 = new Person("Mariel", "Blanco", "123456", 1990, "Venezuela", 'M');

        assertThat(person1.getFirstName(), is("Mariel"));
        assertThat(person1.getLastName(), is("Blanco"));
        assertThat(person1.getIdNumber(), is("123456"));
        assertThat(person1.getBirthYear(), is(1990));
        assertThat(person1.getCountryOfBirth(), is("Venezuela"));
        assertThat(person1.getGender(), is('M'));
    }

    @Test
    void testPerson2Attributes() {
        Person person2 = new Person("Dany", "Longa", "654321", 1988, "Venezuela", 'H');

        assertThat(person2.getFirstName(), is("Dany"));
        assertThat(person2.getLastName(), is("Longa"));
        assertThat(person2.getIdNumber(), is("654321"));
        assertThat(person2.getBirthYear(), is(1988));
        assertThat(person2.getCountryOfBirth(), is("Venezuela"));
        assertThat(person2.getGender(), is('H'));
    }
}
