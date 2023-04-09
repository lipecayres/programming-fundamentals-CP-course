import java.util.Random;

public class Potions {
    private String name;
    private String effect;
    private int effectValue;

    public Potions(String name, String effect, int effectValue) {
        this.name = name;
        this.effect = effect;
        this.effectValue = effectValue;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

    public int getEffectValue() {
        return effectValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public void modifyHero() {
        // array of potion names and effect values
        String[] potionNames = { "Attack Potion", "Defense Potion", "Health Potion" };
        int[] effectValues = { 10, 5, 20 };

        String x;
        int y;

        Random rand = new Random();

        int randomNumber = rand.nextInt(3);

        switch(randomNumber){
        case 0:
            x = potionNames[0];
            y = effectValues[0];
            break;
        case 1:
            x= potionNames[1];
            y= effectValues[1];
            break;
        case 2:
            x = potionNames[2];
            y = effectValues[2];
            break;   
        }
    }
}
