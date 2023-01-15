package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Hero {
    private String name;
    private int level;
    private HeroAttributes levelAttributes;
    private Map<Slot, Item> equipment;
    private List<WeaponType> validWeaponTypes;
    private List<ArmorType> validArmorTypes;

    public Hero(String name) {
        this.name = name;
        this.level = 1;
        this.levelAttributes = new HeroAttributes(0, 0, 0);
        this.equipment = new HashMap<>();
        this.validWeaponTypes = new ArrayList<>();
        this.validArmorTypes = new ArrayList<>();
        //initialize equipment with null values
        for (Slot slot : Slot.values()) {
            equipment.put(slot, null);
        }
    }

    public abstract void levelUp();

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
        equipment.put(item.getSlot(), item);
    }

    public void setValidWeaponTypes(List<WeaponType> validWeaponTypes) {
        this.validWeaponTypes = validWeaponTypes;
    }

    public void setValidArmorTypes(List<ArmorType> validArmorTypes) {
        this.validArmorTypes = validArmorTypes;
    }

    public void setLevelAttributes(HeroAttributes levelAttributes) {
        this.levelAttributes = levelAttributes;
    }

    public HeroAttributes totalAttributes(){
        int totalStr= levelAttributes.getStrength();
        int totalDex= levelAttributes.getDexterity();
        int totalInt= levelAttributes.getIntelligence();
        for(Map.Entry<Slot, Item> entry: equipment.entrySet()){
            if(entry.getKey() != Slot.WEAPON && entry.getValue() != null){
                Armor armor = (Armor) entry.getValue();
                totalStr += armor.getAttribute().getStrength();
                totalDex += armor.getAttribute().getDexterity();
                totalInt += armor.getAttribute().getIntelligence();
            }
        }
        return new HeroAttributes(totalStr,totalDex,totalInt);
    }
    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\n");
        sb.append("Class: " + this.getClass().getSimpleName() + "\n");
        sb.append("Level: " + level + "\n");
        sb.append("Total Attributes: " + totalAttributes().toString() + "\n");
        sb.append("Damage: " + damage() + "\n");
        return sb.toString();
    }
    public int damage() {
        int weaponDamage = 1;
        if (equipment.get(Slot.WEAPON) != null) {
            weaponDamage = ((Weapon) equipment.get(Slot.WEAPON)).getDamage();
        }
        int attribute = 0;
        switch (this.getClass().getSimpleName()) {
            case "Warrior":
                attribute = totalAttributes().getStrength();
                break;
            case "Mage":
                attribute = totalAttributes().getIntelligence();
                break;
            case "Ranger", "Rogue":
                attribute = totalAttributes().getDexterity();
                break;
        }
        return (int) (weaponDamage * (1 + attribute / 100));
    }
}
