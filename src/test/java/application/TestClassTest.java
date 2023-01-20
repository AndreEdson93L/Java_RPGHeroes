package application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)

public class TestClassTest {
    @Test
    public void testLevelUp() {
        Hero warrior = new Warrior("Japanese Samurai");
        warrior.levelUp();
        warrior.levelUp();
        warrior.levelUp();
        assertEquals(4, warrior.getLevel());
    }

    @Test
    public void testTotalAttributes() {
        Hero warrior = new Warrior("Japanese Samurai");
        int strength = warrior.getStrength(); //5
        int dexterity = warrior.getDexterity(); //2
        int intelligence = warrior.getIntelligence(); //1
        assertEquals(5, strength);
        assertEquals(2, dexterity);
        assertEquals(1, intelligence);
    }

    @Test
    public void testDamage() throws Exception {
        Hero warrior = new Warrior("Samurai");
        warrior.levelUp();
        Weapon weapon = new Weapon(2, WeaponType.SWORD, 5);
        warrior.equip(weapon);
        assertEquals(5, warrior.setDamageToEnemy(weapon));
    }

    @Test
    public void testDisplay() throws Exception {
        Warrior warrior = new Warrior("Samurai");
        warrior.levelUp();
        warrior.levelUp();
        Weapon weapon = new Weapon(3, WeaponType.HAMMER, 10);
        warrior.equip(weapon);
        String displayString = "Name: Samurai\n" +
                "Class: Warrior\n" +
                "Level: 3\n" +
                "Total Attributes: \n"
                + "strength: 11\n"
                + "dexterity: 6\n"
                + "intelligence: 3";
        assertEquals(displayString, warrior.display());
    }

    @Test
    public void testTypeOfWeapon() throws Exception {
        Warrior warrior = new Warrior("Iron Wolf");
        Weapon weapon = new Weapon(1, WeaponType.AXE, 6);
        warrior.equip(weapon);
        assertEquals(weapon.getType(), WeaponType.AXE);
        Armor armor = new Armor(2,Slot.BODY, ArmorType.CLOTH);
        warrior.levelUp();
        warrior.equip(armor);
        assertEquals(armor.getType(), ArmorType.CLOTH);
    }
}