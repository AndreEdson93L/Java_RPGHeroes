package org.example;

class Ranger extends Hero {
    public Ranger() {
        super(1, 7, 1, 1);
    }

    public void levelUp() {
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 5);
        setIntelligence(getIntelligence() + 1);
        setLevel(getLevel() + 1);
    }
}
