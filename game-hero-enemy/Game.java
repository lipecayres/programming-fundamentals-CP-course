import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void startGame(Hero hero, Enemy enemy){

        System.out.printf("\n+==================WELCOME=TO==================+\n");

        System.out.println("""
            \t  -----------------------------------
            \t  ||             HERO              ||
            \t  ||              X                ||
            \t  ||             ENEMY             ||
            \t  -----------------------------------\n""");

    
        Random rnd = new Random();

        Scanner sc = new Scanner(System.in);
        int round = 1;

        //while loop with the game
        while (hero.getHp() >= 0 || enemy.getHp() >= 0){
            //check if someone is the winner
            if(isGameEnded(hero, enemy)){break;}
            //chance of getting potions shop
            int chance = rnd.nextInt(6);

            System.out.printf("\n+===================Round=%s===================+\n", round);

            if(chance == 0){
                if(potionRound(sc, hero, enemy) == 1){
                    continue;
                }
            }else {
                if(normalRound(sc, hero, enemy) == 1){
                    continue;
                }
            }
            round++;
        }
    }
    private static int normalRound(Scanner sc, Hero hero, Enemy enemy){
        System.out.println("""
               \t  -----------------------------------
               \t  ||Enter 1 -> to attack           ||
               \t  ||Enter 2 -> to use shield       ||
               \t  ||Enter 3 -> to use potion       ||
               \t  -----------------------------------""");

        try {
            System.out.print("Select your option: ");
            int usersChoice = sc.nextInt();
            switch (usersChoice){
                case 1 -> {
                    System.out.println("");
                    if(hero.isHit(enemy) == -1){
                        System.out.println("\t  ||Hero is missed                 ||");
                    }else {
                        System.out.println("\t  ||Hero hit enemy                 ||");
                    }

                    if(enemy.isHit(hero) == -1){
                        System.out.println("\t  ||Enemy is missed                ||");
                    }else {
                        System.out.println("\t  ||Enemy hit hero                 ||");
                    }

                    System.out.printf("""
                        +================Statistics==================+
                        | Hero's HP is -> %27s|
                        | Enemy's HP is -> %26s|
                        +============================================+%n""", hero.getHp(), enemy.getHp());
                }
                case 2 -> {
                    System.out.println("");
                    hero.useShield();

                    if(enemy.isHit(hero) == -1){
                        System.out.println("\t  ||Enemy is missed                ||");
                    }else {
                        System.out.println("\t  ||Enemy hit hero                 ||");
                    }

                    hero.useShield();
                }
                case 3 -> {
                    System.out.println("");
                    if(hero.drinkPotion() == 1){
                        return 1;
                    }

                    if(enemy.isHit(hero) == -1){
                        System.out.println("\t  ||Enemy is missed                ||");
                    }else {
                        System.out.println("\t  ||Enemy hit hero                 ||");
                    }
                }
                default -> {
                    System.out.println("Wrong input!");
                    return 1;
                }
            }
        }catch (Exception e){
            System.out.println("Wrong input!");
            sc.next();
        }
        return 0;
    }
    private static int potionRound(Scanner sc, Hero hero, Enemy enemy){
        Potions[] potions = Potions.generatePotions();

        System.out.printf("""
               \t  -----------------------------------
               \t  -----------POTIONS ROUND-----------
               \t  -----------------------------------
               \t  ||Enter 1 -> %-7s price: %5s||
               \t  ||Enter 2 -> %-7s price: %5s||
               \t  ||Enter 3 -> %-7s price: %5s||
               \t  ||Enter 4 -> to leave a shop     ||
               \t  -----------------------------------""",
                potions[0].getName(), potions[0].getPrice(),
                potions[1].getName(),potions[1].getPrice(),
                potions[2].getName(), potions[2].getPrice());

        try {
            System.out.print("\nSelect your option: ");
            int usersChoice = sc.nextInt();
            if(hero.getPotion()[0] == null || hero.getPotion()[1] == null){
                switch (usersChoice){
                    case 1 -> {
                        hero.buyPotion(potions[0]);
                    }
                    case 2 -> {
                        hero.buyPotion(potions[1]);
                    }
                    case 3 -> {
                        hero.buyPotion(potions[2]);
                    }
                    case 4 -> {
                        return 0;
                    }
                    default -> {
                        System.out.println("Wrong input!");
                        return 1;
                    }
                }
            }else {
                System.out.println("There is no place in inventory");
            }

        }catch (Exception e){
            System.out.println("Wrong input!");
            sc.next();
        }
        return 0;
    }
    private static boolean isGameEnded(Hero hero, Enemy enemy){
        if(hero.getHp() == 0 && enemy.getHp() == 0){
            System.out.println("\n+==================END=GAME==================+\n");
            System.out.println("+===================Draw=====================+\n");
            return true;
        } else if (enemy.getHp() == 0) {
            System.out.println("\n+==================END=GAME==================+\n");
            System.out.println("+================Hero=wins===================+\n");
            return true;
        } else if (hero.getHp() == 0){
            System.out.println("\n+==================END=GAME==================+\n");
            System.out.println("+================Enemy=wins==================+\n");
            return true;
        }
        return false;
    }
}
