import java.util.Random;

public class Enemy {
    private int hp; // health points
    private int defence;
    private int power;
    private String name;

    // Default constructor
    public Enemy() {
    }

    // Constructor with 4 arguments
    public Enemy(int hp, int defence, int power, String name) {
        this.hp = hp;
        this.defence = defence;
        this.power = power;
        this.name = name;
    }

    // Getters and setters
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // Getters and setters
    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    // Getters and setters
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    // First public method to attack
    private int attack(Hero hero) {

        int hpAfterAttack = hero.getHp() - power + hero.getDefence();


        if (hpAfterAttack < 0) {
            hpAfterAttack = 0;
        }

        hero.setHp(hpAfterAttack);
        return hpAfterAttack;
    }

    // Second public method miss
    public int isHit(Hero hero) {
        Random rnd = new Random();
        int chance = rnd.nextInt(4);
        if (chance == 0 || chance == 1){
            return -1;
        }else {
            if(hero.getShield()){
                System.out.printf("\t  ||Hero reflected attack of %6s||\n", name);
                return -1;
            }
            int chanceOfSpecialAttack = rnd.nextInt(2);
            if(chanceOfSpecialAttack == 0){
                System.out.printf("\t  ||%s used special attack     ||\n", name);
                return specialAttack(hero);
            }
            return attack(hero);
        }
    }

    // third private SpecialAttack class
    private int specialAttack(Hero hero) {
        int hpAfterAttack = hero.getHp() + hero.getDefence() - power * 2 ;

        if (hpAfterAttack < 0) {
            hpAfterAttack = 0;
        }

        hero.setHp(hpAfterAttack);
        return hpAfterAttack;
    }

    // forth public getDamage class
    public void getDamage(int damage) {
        hp = damage - hp;

    }

}
