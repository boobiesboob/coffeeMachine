import java.util.Scanner;

public class CoffeeMachinePart2 {
    private static int milkPerCup = 50;
    private static int waterPerCup = 200;
    private static int beansPerCup = 15;
    private static int coffeeCup = 0;

    public static void countAmountOfCups() {
        Scanner scanner = new Scanner(System.in);
        coffeeCup = scanner.nextInt();
    }

    public static void output() {
        System.out.println("For " + coffeeCup + " cups of coffee you will need:");
        System.out.println(coffeeCup * waterPerCup + "  ml of water");
        System.out.println(coffeeCup * milkPerCup + " ml of milk");
        System.out.print(coffeeCup * beansPerCup + " g of coffee beans");
    }

    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need: ");
        countAmountOfCups();
        output();
    }
}
