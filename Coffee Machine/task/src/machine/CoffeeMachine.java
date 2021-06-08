package machine;

import java.util.Scanner;

import static machine.Coffee.calcIngredients;
import static machine.Coffee.calcNumberOfServings;
import static machine.Print.printMachineStatus;
import static machine.RunMachine.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        MachineOfCoffee machine = new MachineOfCoffee(400, 540, 120, 9, 550);
        while (start(machine));
    }
}
