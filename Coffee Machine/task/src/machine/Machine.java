package machine;

import java.util.Scanner;

import static machine.Print.printMachineStatus;

public class Machine {
    private Machine() {
    }

    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    static boolean start(MachineOfCoffee machine) {
        boolean isContinue = true;
        System.out.println();
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String inputAction = scanner.nextLine().trim().toUpperCase();
        Action action = Action.WRONGACTION;
        try {
            action = Action.valueOf(inputAction);
        } catch (IllegalArgumentException e) {
            System.out.println("check input");
        }

        switch (action) {
            case BUY:
                buy(machine);
                break;
            case FILL:
                fill(machine);
                break;
            case TAKE:
                take(machine);
                break;
            case REMAINING:
                printMachineStatus(machine);
                break;
            case EXIT:
                isContinue = false;
                break;
            default:
                break;
        }

        return isContinue;
    }

    private static void buy(MachineOfCoffee machine) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String input = scanner.nextLine().trim().toLowerCase();
        if (input.equals("back")) {
            start(machine);
        }
        int option = 0;
        try {
            option = Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            System.out.println("enter a number");
        }
        switch (option) {
            case 1:
                tryBuyCoffee(machine, CoffeeType.ESPRESSO);
                break;
            case 2:
                tryBuyCoffee(machine, CoffeeType.LATTE);
                break;
            case 3:
                tryBuyCoffee(machine, CoffeeType.CAPPUCCINO);
                break;
            default:
                break;
        }
    }

    private static void tryBuyCoffee(MachineOfCoffee machine, CoffeeType coffeeType) {
        if (machine.canMakeCoffee(coffeeType)) {
            buyCoffee(machine, coffeeType);
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    private static void buyCoffee(MachineOfCoffee machine, CoffeeType coffeeType) {
        machine.setWaterV(machine.getWaterV() - coffeeType.getWaterV());
        machine.setMilkV(machine.getMilkV() - coffeeType.getMilkV());
        machine.setCoffeeM(machine.getCoffeeM() - coffeeType.getCoffeeM());
        machine.setDisposableCups(machine.getDisposableCups() - 1);
        machine.setStoredMoney(machine.getStoredMoney() + coffeeType.getCost());
    }

    private static void fill(MachineOfCoffee machine) {

        System.out.println("Write how many ml of water you want to add:");
        int waterV = 0;
        int milkV = 0;
        int coffeeM = 0;
        int disposableCups = 0;
        try {
            waterV = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Write how many ml of milk you want to add:");
            milkV = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Write how many grams of coffee beans you want to add:");
            coffeeM = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Write how many disposable cups of coffee you want to add:");
            disposableCups = Integer.parseInt(scanner.nextLine().trim());
        } catch (IllegalArgumentException e) {
            System.out.println("enter a valid value");
        }
        machine.setWaterV(machine.getWaterV() + waterV);
        machine.setMilkV(machine.getMilkV() + milkV);
        machine.setCoffeeM(machine.getCoffeeM() + coffeeM);
        machine.setDisposableCups(machine.getDisposableCups() + disposableCups);
    }

    private static void take(MachineOfCoffee machine) {
        if (machine.getStoredMoney() > 0) {
            System.out.println("I gave you $" + machine.getStoredMoney());
            machine.setStoredMoney(0);
        }
    }
}