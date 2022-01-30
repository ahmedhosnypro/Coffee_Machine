package machine;

public class Print {
    static void printInstructions() {
        System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");
    }

    static void printMachineStatus(MachineOfCoffee machine) {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(machine.getWaterV() + " ml of water");
        System.out.println(machine.getMilkV() + " ml of milk");
        System.out.println(machine.getCoffeeM() + " g of coffee beans");
        System.out.println(machine.getDisposableCups() + " disposable cups");
        System.out.println("$" + machine.getStoredMoney() + " of money");
    }
}