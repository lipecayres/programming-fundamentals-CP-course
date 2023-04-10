/**
 * Application Purpose: Main class to run the game
 * Author: Eduardo, Felipe, Maksim, Pedro, Roman
 * Date: Apr 10th, 2023
 * Time: 5:30 PM
 */

 public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(2000, 0, 150, 0, false, 0);
        Enemy enemy = new Enemy(1000, 50, 250, "Dragon");
        Game.startGame(hero, enemy);
    }
}