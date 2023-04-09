import java.util.Random;

public class GameTest {
    public static void main(String[] args) {

        // new characters
        Enemy kaiba = new Enemy(2000, 200, 150, "Kaiba");
        Hero yami = new Hero(2000, 150, 250, 0, false, 0);

        // menu
        System.out.println("Choose an option:");
        System.out.println("1- attack");
        System.out.println("\n----------");

        // kaiba initial hp:
        System.out.println("Kaiba initial hp:" + kaiba.getHp());
        // yami initial hp:
        System.out.println("Yami initial hp:" + yami.getHp());

        System.out.println("----------\n");

        // rounds
        int counter = 0;

        // game running
        while (kaiba.getHp() > 0 || yami.getHp() > 0) {
            counter++;

            } 
            

            // attack probability
            Random rand = new Random();
            int number = rand.nextInt(9);

            // rounds
            System.out.println("Round " + counter);
            
            if (yami.getHp() <= 0) {
                
                System.out.println("Yami new hp:" + yami.getHp());

                System.out.println("Kaiba wins");
            }  

            if (number >= 4) {
                yami.attack(kaiba);

                System.out.println("Yami attacks kaiba with power:" + yami.getPower());
                System.out.println("Kaiba new hp:" + kaiba.getHp());

            } else if (number < 4) {
                kaiba.miss();
            }



            if (kaiba.getHp() <= 0) {
                System.out.println("Kaiba new hp:" + kaiba.getHp());

                System.out.println("Yami wins");

            }
            kaiba.Attack(yami);
            
            
            System.out.println("------");
            System.out.println("Kaiba attacks yami with power:" + kaiba.getPower());
            System.out.println("Yami new hp:" + yami.getHp());

            System.out.println("");

        }


    }
    

