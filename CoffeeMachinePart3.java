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
    private static int amountOfPossibleCups = 0;

    public static int countAmount() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void feelMachine() {
        System.out.println("Write how many ml of water the coffee machine has:");
        waterAmount = countAmount();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milkAmount = countAmount();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        beansAmount = countAmount();
        System.out.println("Write how many cups of coffee you will need:");
        wishedCups = countAmount();
    }

    public static void calcAmountOfPossibleCups() {
        while (waterPerCup <= waterAmount && milkPerCup <= milkAmount && beansPerCup <= beansAmount) {
            waterAmount -= waterPerCup;
            milkAmount -= milkPerCup;
            beansAmount -= beansPerCup;
            amountOfPossibleCups++;
        }
    }

    public static void checkMachine() {
        if (amountOfPossibleCups == wishedCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (amountOfPossibleCups < wishedCups) {
            System.out.println("No, I can make only " + amountOfPossibleCups + " cup(s) of coffee");
        } else if (amountOfPossibleCups > wishedCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (amountOfPossibleCups - wishedCups) + " more than that)");
        }
    }

    public static void main(String[] args) {
        feelMachine();
        calcAmountOfPossibleCups();
        checkMachine();
    }
}
