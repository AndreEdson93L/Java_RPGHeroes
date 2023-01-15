package org.example;

public class Armor extends Item {
    private ArmorType type;
    private HeroAttributes attribute;

    public Armor(String name, int requiredLevel, Slot slot, ArmorType type, HeroAttributes attribute) {
        super(name, requiredLevel, slot);
        this.type = type;
        this.attribute = attribute;
    }

    public boolean canEquip(int heroLevel) {
        return heroLevel >= getRequiredLevel();
    }
    public ArmorType getType() {
        return type;
    }

    public void setType(ArmorType type) {
        this.type = type;
    }

    public HeroAttributes getAttribute() {
        return attribute;
    }

    public void setAttribute(HeroAttributes attribute) {
        this.attribute = attribute;
    }
}
