package fr.crafties.functional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class FellowshipTest {

    private Fellowship fellowship;

    @BeforeEach
    void setUp() {
        fellowship = new Fellowship(asList(
                new Character("Frodo", Race.HOBBIT),
                new Character("Sam", Race.HOBBIT),
                new Character("Pippin", Race.HOBBIT),
                new Character("Merry", Race.HOBBIT),
                new Character("Aragorn", Race.HUMAN),
                new Character("Boromir", Race.HUMAN),
                new Character("Gandalf", Race.WIZARD),
                new Character("Legolas", Race.ELF),
                new Character("Gimli", Race.DWARF)
        ));
    }

    @Test
    @DisplayName("should return the names of all the characters of a given race")
    void should_return_characters_names_by_race() {
        assertThat(fellowship.findAll(Race.HOBBIT)).containsOnly("Frodo", "Sam", "Pippin", "Merry");
    }

}