package org.example;

class Mage extends Hero {
    public Mage() {
        super(1, 1, 8, 1);
    }

    public void levelUp() {
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 5);
        setLevel(getLevel() + 1);
    }
}
