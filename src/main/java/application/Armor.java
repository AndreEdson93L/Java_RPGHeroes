package application;

public class Armor extends Item {
    private ArmorType type;

    public Armor(int requiredLevel, Slot slot, ArmorType type) {
        super(requiredLevel, slot);
        this.type = type;
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
}
