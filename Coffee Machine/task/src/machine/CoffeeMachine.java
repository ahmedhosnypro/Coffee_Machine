package machine;

import java.util.Scanner;

import static machine.Coffee.calcIngredients;
import static machine.Coffee.calcNumberOfServings;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calcNumberOfServings();
    }
}
