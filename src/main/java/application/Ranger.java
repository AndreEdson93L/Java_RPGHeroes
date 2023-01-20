package application;

import java.util.ArrayList;
import java.util.List;

class Ranger extends Hero {
    public Ranger(String name) {
        super(name);
        HeroAttributes levelAttributes = getLevelAttributes();
        levelAttributes.increaseDexterity(7);
        levelAttributes.increaseIntelligence(1);
        levelAttributes.increaseStrength(1);
        List<WeaponType> listOfValidWeapons = new ArrayList<WeaponType>();
        listOfValidWeapons.add(WeaponType.BOW);
        setValidWeaponTypes(listOfValidWeapons);
    }

    public void levelUp() {
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 5);
        setIntelligence(getIntelligence() + 1);
        setLevel(getLevel() + 1);
    }
}
