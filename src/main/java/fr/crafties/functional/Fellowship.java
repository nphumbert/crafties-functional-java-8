package fr.crafties.functional;

import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

class Fellowship {

    private final List<Character> characters;

    Fellowship(List<Character> characters) {
        this.characters = characters;
    }

    Collection<String> findAll(Race race) {
        return characters.stream()
                .filter(character -> character.getRace().equals(race))
                .map(Character::getName)
                .collect(toList());
    }

}
