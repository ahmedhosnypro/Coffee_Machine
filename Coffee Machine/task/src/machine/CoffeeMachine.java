package machine;

import java.util.Scanner;

import static machine.Coffee.calcIngredients;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNum = scanner.nextInt();
        calcIngredients(cupsNum);
    }
}
