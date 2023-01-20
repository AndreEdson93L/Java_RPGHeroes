package application;

import java.util.ArrayList;
import java.util.List;

class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
        HeroAttributes levelAttributes = getLevelAttributes();
        levelAttributes.increaseDexterity(2);
        levelAttributes.increaseIntelligence(1);
        levelAttributes.increaseStrength(5);
        List<WeaponType> listOfValidWeapons = new ArrayList<WeaponType>();
        listOfValidWeapons.add(WeaponType.AXE);
        listOfValidWeapons.add(WeaponType.HAMMER);
        listOfValidWeapons.add(WeaponType.SWORD);
        setValidWeaponTypes(listOfValidWeapons);
    }

    public void levelUp() {
        setStrength(3);
        setDexterity(2);
        setIntelligence(1);
        setLevel(getLevel() + 1);
    }
}
