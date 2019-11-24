public class Main {
    public static void main(String[] args) {
        //System.out.println("Welcome To baking in Java");

        //Create a baking manager
        BakingManager bakingManager = new BakingManager();

        bakingManager.addFoodItem("Bread", "Water, Sugar, Flower.", 5.0, "Bumpkin Bread");
        bakingManager.addFoodItem("Drink", "Water, Lemon, Sugar.", 1.0, "Lemon Water");



        bakingManager.countAllStock();
        bakingManager.listAllStock();
        bakingManager.findIngridiants("Bumpkin Bread");
        bakingManager.findIngridiants("Lemon Water");
        bakingManager.findIngridiants("Juice");
    }
}
