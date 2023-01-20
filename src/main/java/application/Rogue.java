package application;

import java.util.ArrayList;
import java.util.List;

class Rogue extends Hero {
    public Rogue(String name) {
        super(name);
        HeroAttributes levelAttributes = getLevelAttributes();
        levelAttributes.increaseDexterity(6);
        levelAttributes.increaseIntelligence(1);
        levelAttributes.increaseStrength(2);
        List<WeaponType> listOfValidWeapons = new ArrayList<WeaponType>();
        listOfValidWeapons.add(WeaponType.DAGGER);
        listOfValidWeapons.add(WeaponType.SWORD);
        setValidWeaponTypes(listOfValidWeapons);
    }

    public void levelUp() {
        setStrength(getStrength() + 1);
        setDexterity(getDexterity() + 4);
        setIntelligence(getIntelligence() + 1);
        setLevel(getLevel() + 1);
    }
}
