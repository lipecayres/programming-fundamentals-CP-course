import java.util.Random;

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

    private final Potions[] potions = new Potions[2];


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

    public Potions[] getPotion() {
        return potions;
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

    // getters and setters -> PotionAmount
    public void setPotionAmount(int potionAmount) {
        this.potionAmount = potionAmount;
    }

    public int getPotionAmount() {
        return potionAmount;
    }

    // game methods

    private int attack(Enemy enemy) {

        int hpAfterAttack = enemy.getHp() - power - weapon + enemy.getDefence();
        if (hpAfterAttack < 0) {
            hpAfterAttack = 0;
        }
        enemy.setHp(hpAfterAttack);
        return hpAfterAttack;
    }

    public int isHit(Enemy enemy) {
        Random rnd = new Random();
        int chance = rnd.nextInt(4);
        if (chance == 0){
            return -1;
        }else {
            return attack(enemy);
        }
    }

    public void useShield() {
        shield = !shield;
    }

    public int drinkPotion() {
        if (potions[0] == null && potions[1] == null){

            System.out.println("\t  ||You don't have potions         ||");
            return 1;

        }else {
            Potions potion = null;

            if(potions[0] != null){
                potion = potions[0];
                potions[0] = null;
            }else if(potions[1] != null) {
                potion = potions[1];
                potions[1] = null;
            }

            switch (potion.getName()){
                case "Health" ->{
                    hp += potion.getEffectValue();
                    System.out.printf("\t  ||Your hp now is %16s||\n", hp);
                }
                case "Attack" ->{
                    weapon += potion.getEffectValue();
                    System.out.printf("\t  ||Your weapon now is %12s||\n", weapon);
                }
                case "Defense" ->{
                    defence += potion.getEffectValue();
                    System.out.printf("\t  ||Your defence now is %11s||\n", defence);
                }
            }
        }
        return 0;

    }

    public void getDamage(int damage) {
        hp -= damage;

        if (hp < 0) {
            hp = 0;
        }
    }

    public void buyPotion(Potions potion) {
        int newHp = hp - potion.getPrice();
        if(newHp < 0){
            System.out.println("\t  ||You can't but potion            ||");
        }else {
            hp = newHp;
            System.out.printf("\t  ||Your hp now is %16s||\n", hp);
            if(potions[0] == null){
                potions[0] = potion;
            }else {
                potions[1] = potion;
            }
        }

    }

}
