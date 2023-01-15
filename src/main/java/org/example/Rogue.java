package org.example;

class Rogue extends Hero {
    public Rogue() {
        super(2, 6, 1, 1);
    }

    public void levelUp() {
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 4);
        setIntelligence(getIntelligence() + 1);
        setLevel(getLevel() + 1);
    }
}
