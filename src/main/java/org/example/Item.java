package org.example;

abstract class Item {
    private String name;
    private int requiredLevel;
    private Slot slot;

    public Item(String name, int requiredLevel, Slot slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public abstract boolean canEquip(int heroLevel);
}
