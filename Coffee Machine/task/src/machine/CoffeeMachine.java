package machine;

import static machine.Machine.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        MachineOfCoffee machine = new MachineOfCoffee(400, 540, 120, 9, 550);
        while (start(machine)) ;
    }
}