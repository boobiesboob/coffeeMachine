package coffeeMachine;

import java.util.Scanner;

public class CoffeeMachinePart3 {
    private static int milkPerCup = 50;
    private static int waterPerCup = 200;
    private static int beansPerCup = 15;
    private static int coffeeCup = 0;
    private static int milkAmount = 0;
    private static int waterAmount = 0;
    private static int beansAmount = 0;
    private static int wishedCups = 0;

    public static int countAmount() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Write how many ml of water the coffee machine has:");
        waterAmount = countAmount();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milkAmount = countAmount();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        beansAmount = countAmount();
        System.out.println("Write how many cups of coffee you will need:");
        wishedCups = countAmount();
    }
}
