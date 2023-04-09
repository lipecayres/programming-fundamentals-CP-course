
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
    public void Attack(Hero hero) {

        int hpAfterAttack = hero.getHp() - power; // the power come from where?
    

        if (hpAfterAttack < 0) {
            hpAfterAttack = 0;
        }

        hero.setHp(hpAfterAttack);
    }

    // Second public method miss
    public void miss() {
        System.out.println("Missed attack");
    }

    // third public SpecialAttack class
    public void SpecialAttack(Hero hero) {
        int damage = power * 1 - hero.getDefence(); // this number 1 needs to change. I dont know how much would be the
        
        // special attack
        if (damage > 0) {
            hero.getDamage(damage);
            // any print here?
        }
    }

    // forth public getDamage class
    public void getDamage(int damage) {
        hp = damage - hp;

    }

}
