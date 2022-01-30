package machine;

import java.util.Scanner;

public abstract class Coffee {
    final static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    static void calcIngredients() {
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNum = scanner.nextInt();
        System.out.println("For 25 cups of coffee you will need:");
        System.out.println(cupsNum * 200 + " ml of water");
        System.out.println(cupsNum * 50 + " ml of milk");
        System.out.println(cupsNum * 15 + " g of coffee beans");
    }

    static void calcNumberOfServings() {
        System.out.println("Write how many ml of water the coffee machine has:");
        int milkV = 0;
        int waterV = 0;
        int coffeeM = 0;
        int wantedCups = 0;
        try {
            waterV = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Write how many ml of milk the coffee machine has: ");
            milkV = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Write how many grams of coffee beans the coffee machine has: ");
            coffeeM = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Write how many cups of coffee you will need: ");
            wantedCups = Integer.parseInt(scanner.nextLine().trim());
        } catch (IllegalArgumentException e) {
            System.out.println("please enter a number");
        }

        int cupsAvailable = waterV / 200;
        cupsAvailable = Math.min(cupsAvailable, milkV / 50);
        cupsAvailable = Math.min(cupsAvailable, coffeeM / 15);

        if (cupsAvailable == wantedCups) {
            System.out.println("Yes, I can make that amount of coffee\n");
        } else if (cupsAvailable < wantedCups) {
            System.out.println("No, I can make only " + cupsAvailable + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    (cupsAvailable - wantedCups) + " more than that)");
        }
    }

}