package machine;

public class MachineOfCoffee extends Coffee {
    private int milkV = 0;
    private int waterV = 0;
    private int coffeeM = 0;
    private int disposableCups = 0;
    private int storedMoney = 0;

    MachineOfCoffee(int waterV, int milkV, int coffeeM, int disposableCups, int storedMoney) {
        this.waterV = waterV;
        this.milkV = milkV;
        this.coffeeM = coffeeM;
        this.disposableCups = disposableCups;
        this.storedMoney = storedMoney;
    }

    public int getWaterV() {
        return waterV;
    }

    public void setWaterV(int waterV) {
        this.waterV = waterV;
    }

    public int getMilkV() {
        return milkV;
    }

    public void setMilkV(int milkV) {
        this.milkV = milkV;
    }

    public int getCoffeeM() {
        return coffeeM;
    }

    public void setCoffeeM(int coffeeM) {
        this.coffeeM = coffeeM;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public int getStoredMoney() {
        return storedMoney;
    }

    public void setStoredMoney(int storedMoney) {
        this.storedMoney = storedMoney;
    }

    public boolean canMakeCoffee(CoffeeType coffeeType, int wantedCups) {
        boolean canMakeCoffee = true;
//        int cupsAvailable = Integer.MAX_VALUE;
//        cupsAvailable = waterV / coffeeType.getWaterV();
//        if (coffeeType != CoffeeType.ESPRESSO) {
//            cupsAvailable = Math.min(cupsAvailable, milkV / coffeeType.getMilkV());
//        }
//        cupsAvailable = Math.min(cupsAvailable, coffeeM / coffeeType.getCoffeeM());
//        if (cupsAvailable < wantedCups) {
//            canMakeCoffee = false;
//        }

        if (waterV / coffeeType.getWaterV() < 1) {
            canMakeCoffee = false;
            System.out.println("Sorry, not enough water!");
        }
        if (coffeeType != CoffeeType.ESPRESSO) {
            if (milkV / coffeeType.getMilkV() < 1) {
                canMakeCoffee = false;
                System.out.println("Sorry, not enough milk!");
            }
        }
        if (coffeeM / coffeeType.getCoffeeM() < 1) {
            canMakeCoffee = false;
            System.out.println("Sorry, not enough coffee!");
        }
        if (disposableCups < 1) {
            canMakeCoffee = false;
            System.out.println("Sorry, not enough cups!");
        }

        return canMakeCoffee;
    }
}
