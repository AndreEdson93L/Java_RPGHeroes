package org.example;

class Warrior extends Hero {
    public Warrior() {
        super(5, 2, 1, 1);
    }

    public void levelUp() {
        setStrength(getStrength() + 3);
        setDexterity(getDexterity() + 2);
        setIntelligence(getIntelligence() + 1);
        setLevel(getLevel() + 1);
    }
}
