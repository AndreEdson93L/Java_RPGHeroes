package application;

import java.util.ArrayList;
import java.util.List;

class Mage extends Hero {
    public Mage(String name) {
        super(name);
        HeroAttributes levelAttributes = getLevelAttributes();
        levelAttributes.increaseDexterity(1);
        levelAttributes.increaseIntelligence(8);
        levelAttributes.increaseStrength(1);
        List<WeaponType> listOfValidWeapons = new ArrayList<WeaponType>();
        listOfValidWeapons.add(WeaponType.STAFF);
        listOfValidWeapons.add(WeaponType.WAND);
        setValidWeaponTypes(listOfValidWeapons);
    }

    public void levelUp() {
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 5);
        setLevel(getLevel() + 1);
    }
}