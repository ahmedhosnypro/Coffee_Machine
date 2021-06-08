package machine;

public abstract class Coffee {
    static void calcIngredients(int cups){
        int cupsNum = cups;
        System.out.println("For 25 cups of coffee you will need:");
        System.out.println(cups * 200 + " ml of water");
        System.out.println(cups * 50 + " ml of milk");
        System.out.println(cups * 15 + " g of coffee beans");
    }
}
