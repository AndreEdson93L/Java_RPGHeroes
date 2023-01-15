package org.example;

public class HeroAttributes {
    private int strength;
    private int dexterity;
    private int intelligence;

    public HeroAttributes(int strength, int dexterity, int intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public void increaseStrength(int amount) {
        strength += amount;
    }

    public void increaseDexterity(int amount) {
        dexterity += amount;
    }

    public void increaseIntelligence(int amount) {
        intelligence += amount;
    }

    public HeroAttributes add(HeroAttributes other) {
        return new HeroAttributes(strength + other.strength,
                dexterity + other.dexterity,
                intelligence + other.intelligence);
    }

    //getters
    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }
}

