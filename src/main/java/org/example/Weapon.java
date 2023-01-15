package org.example;

public class Weapon extends Item{
    private WeaponType type;
    private int damage;
    private Slot slot = Slot.WEAPON;

    public Weapon(String name, int requiredLevel, WeaponType type, int damage) {
        super(name, requiredLevel, Slot.WEAPON);
        this.type = type;
        this.damage = damage;
    }
    public boolean canEquip(int heroLevel) {
        return heroLevel >= getRequiredLevel();
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Slot getSlot() {
        return slot;
    }
}

