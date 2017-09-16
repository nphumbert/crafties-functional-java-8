package fr.crafties.functional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Fellowship {

    private final List<Character> characters;

    Fellowship(List<Character> characters) {
        this.characters = characters;
    }

    Collection<String> findAll(Race race) {
        Collection<String> names = new ArrayList<>();
        for (Character character : characters) {
            if (character.getRace().equals(race)) {
                names.add(character.getName());
            }
        }

        return names;
    }
}
