package machine;

public enum CoffeeType {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6),
    WRONGTYPE(0, 0, 0, 0);

    int milkV;
    int waterV;
    int coffeeM;
    int cost;

    CoffeeType(int waterV, int milkV, int coffeeM, int cost) {
        this.milkV = milkV;
        this.waterV = waterV;
        this.coffeeM = coffeeM;
        this.cost = cost;
    }

    public int getWaterV() {
        return waterV;
    }

    public int getMilkV() {
        return milkV;
    }

    public int getCoffeeM() {
        return coffeeM;
    }

    public int getCost() {
        return cost;
    }
}