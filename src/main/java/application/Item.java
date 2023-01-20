package application;

public class Item {
    private int requiredLevel;
    private Slot slot;

    public Item(int requiredLevel, Slot slot) {
        this.requiredLevel = requiredLevel;
        this.slot = slot;
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

}
