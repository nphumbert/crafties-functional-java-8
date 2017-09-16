package fr.crafties.functional;

class Character {

    private final String name;
    private final Race race;

    Character(String name, Race race) {
        this.name = name;
        this.race = race;
    }

    String getName() {
        return name;
    }

    Race getRace() {
        return race;
    }
}
