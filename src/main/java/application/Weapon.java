package application;

public class Weapon extends Item{
    private WeaponType type;
    private int damage;
    private Slot slot = Slot.WEAPON;

    public Weapon(int requiredLevel, WeaponType type, int damage) {
        super(requiredLevel, Slot.WEAPON);
        this.type = type;
        this.damage = damage;
    }

    public WeaponType getTypeOfWeapon() {
        return type;
    }

    public WeaponType getType() {
        return type;
    }


    public int getDamage() {
        return damage;
    }


    public Slot getSlot() {
        return slot;
    }
}

