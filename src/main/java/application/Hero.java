package application;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero {
    private String name;
    private int level;
    private HeroAttributes levelAttributes;
    private List<Item> equipment;
    private List<WeaponType> validWeaponTypes;
    private List<ArmorType> validArmorTypes;

    public abstract void levelUp();
    public Hero(String name) {
        this.name = name;
        this.level = 1;
        this.levelAttributes = new HeroAttributes(0, 0, 0);
        this.equipment = new ArrayList<Item>();
        this.validWeaponTypes = new ArrayList<WeaponType>();
        this.validArmorTypes = new ArrayList<ArmorType>();
    }

    public void equip(Item item) throws  Exception {
        if (item instanceof Weapon) {
            Weapon weapon = (Weapon) item;
            if (!validWeaponTypes.contains(weapon.getType())) {
                throw new Exception("Invalid weapon type for this hero.");
            }
        } else {
            Armor armor = (Armor) item;
            if (!validArmorTypes.contains(armor.getType())) {
                throw new Exception("Invalid armor type for this hero.");
            }
        }
        equipment.add(item);
    }

    public HeroAttributes totalAttributes(){
        int totalStr= levelAttributes.getStrength();
        int totalDex= levelAttributes.getDexterity();
        int totalInt= levelAttributes.getIntelligence();

        return new HeroAttributes(totalStr,totalDex,totalInt);
    }
    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\n");
        sb.append("Class: " + this.getClass().getSimpleName() + "\n");
        sb.append("Level: " + level + "\n");
        sb.append("Total Attributes: "
                + "\nstrength: " + levelAttributes.getStrength()
                + "\ndexterity: " + levelAttributes.getDexterity()
                + "\nintelligence: " + levelAttributes.getIntelligence());
        return sb.toString();
    }
    public void setValidWeaponTypes(List<WeaponType> validWeaponTypes) {
        this.validWeaponTypes = validWeaponTypes;
    }
    public int setDamageToEnemy(Weapon weapon){
        return weapon.getDamage();
    }
    public void setStrength(int strength) {
        levelAttributes.increaseStrength(strength);
    }

    public void setDexterity(int dexterity) {
        levelAttributes.increaseDexterity(dexterity);
    }

    public void setIntelligence(int intelligence) {
        levelAttributes.increaseIntelligence(intelligence);
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getStrength() {
        return levelAttributes.getStrength();
    }

    public int getDexterity() {
        return levelAttributes.getDexterity();
    }

    public int getIntelligence() {
        return levelAttributes.getIntelligence();
    }

    public int getLevel() {
        return this.level;
    }
    public HeroAttributes getLevelAttributes() {
        return levelAttributes;
    }
    public List<Item> getEquipment() {
        return equipment;
    }
}
