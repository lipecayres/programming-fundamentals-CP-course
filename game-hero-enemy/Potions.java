import java.util.Random;

public class Potions {
    private String name;
    private int effectValue;
    private int price;

    public Potions(String name, int effectValue, int price) {
        this.name = name;
        this.effectValue = effectValue;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getEffectValue() {
        return effectValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEffectValue(int effectValue) {
        this.effectValue = effectValue;
    }

    public static Potions[] generatePotions() {

        Potions[] potions = new Potions[3];
        Random rnd = new Random();
        // array of potion names and effect values
        String[] potionNames = { "Attack", "Defense", "Health" };
        int[] effectValues = { 50, 70, 100 };
        int[] priceValues = { 150, 100, 200 };

        for (int i = 0; i < potions.length; i++) {
            potions[i] = new Potions(potionNames[rnd.nextInt(3)], effectValues[rnd.nextInt(3)], priceValues[rnd.nextInt(3)]);
        }

        return potions;
    }
}

