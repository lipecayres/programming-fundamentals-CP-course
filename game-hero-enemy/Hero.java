
/**
 * Application Purpose: Build a blueprint hero class - states and behavior
 * Author: Felipe Cayres
 * Date: Apr 4th, 2023
 * Time: 11:30 PM
 */

public class Hero {

    // variables
    private int hp, defence, power, weapon, potionAmount;
    private boolean shield;

    // default constructor
    public Hero() {
    }

    // constructor with arguments
    public Hero(int hp, int defence, int power, int weapon, boolean shield, int potionAmount) {
        this.hp = hp;
        this.defence = defence;
        this.power = power;
        this.weapon = weapon;
        this.shield = shield;
        this.potionAmount = potionAmount;
    }

    // getters and setters -> hp
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    // getters and setters -> defence
    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

    // getters and setters -> power
    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    // getters and setters -> weapon
    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public int getWeapon() {
        return power;
    }

    // getters and setters -> shield
    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public boolean getShield() {
        return shield;
    }

    // getters and setters -> shield
    public void setPotionAmount(int potionAmount) {
        this.potionAmount = potionAmount;
    }

    public int getPotionAmount() {
        return potionAmount;
    }

    // game methods

    public void attack(Enemy enemy) {

        int hpAfterAttack = enemy.getHp() - power - weapon;
        if (hpAfterAttack < 0) {
            hpAfterAttack = 0;
        }
        enemy.setHp(hpAfterAttack);
    }

    public void miss() {
        System.out.println("Missed attack");
    }

    public void useShield() {
        shield = !shield;
    }

    public void drinkPotion(Potions potion) {
        // get amount of healing of potion class
        // int hpAfterPotion = hp + potion;

        // check if maximum hp. 
    }

    public void getDamage(int damage) {
        hp -= damage;

        if (hp < 0) {
            hp = 0;
        }
    }

    public void buyPotion(Potions potion) {
        // select potion

        // store;
    }

}