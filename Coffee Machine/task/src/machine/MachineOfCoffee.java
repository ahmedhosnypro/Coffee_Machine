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
        int cupsAvailable = Integer.MAX_VALUE;
        cupsAvailable = waterV / coffeeType.getWaterV();
        if (coffeeType != CoffeeType.ESPRESSO){
            cupsAvailable = Math.min(cupsAvailable, milkV / coffeeType.getMilkV());
        }
        cupsAvailable = Math.min(cupsAvailable, coffeeM / coffeeType.getCoffeeM());

//        if (cupsAvailable == wantedCups){
////            System.out.println("Yes, I can make that amount of coffee\n");
//        }
//        else
        if (cupsAvailable < wantedCups) {
//            System.out.println("No, I can make only " + cupsAvailable + " cup(s) of coffee");
            canMakeCoffee = false;
        }
//        else {
//            System.out.println("Yes, I can make that amount of coffee (and even " +
//                    (cupsAvailable - wantedCups) + " more than that)");
//        }

        return canMakeCoffee;
    }
}

