public class Main {
    public static void main(String[] args) {
        //System.out.println("Welcome To baking in Java");

        //Create a baking manager
        BakingManager bakingManager = new BakingManager();
        IngredientsManager ingredientsManager = new IngredientsManager();


        System.out.println(ingredientsManager.addBuyableIngredient("Flour", 5.0));
        System.out.println(ingredientsManager.addBuyableIngredient("Water", 3.50));
        System.out.println(ingredientsManager.addBuyableIngredient("Lemon", 2.00));
        System.out.println(ingredientsManager.addBuyableIngredient("Sugar", 3.0));

        System.out.println(ingredientsManager.buyIngredients("Flour", 5));
        System.out.println(ingredientsManager.buyIngredients("Sugar", 1));
        System.out.println(ingredientsManager.buyIngredients("Water", 1));

        System.out.println("Currently in stock there is: " + ingredientsManager.listAllIngredients());


        bakingManager.addFoodItem("Bread", "Water, Sugar, Flower.", 5.0, "Bumpkin Bread");
        bakingManager.addFoodItem("Drink", "Water, Lemon, Sugar.", 10.0, "Lemon Water");



        bakingManager.countAllStock();
        bakingManager.listAllStock();
        bakingManager.findIngridiants("Bumpkin Bread");
        bakingManager.findIngridiants("Lemon Water");
        bakingManager.findIngridiants("Juice");

        bakingManager.getItemPrice("Lemon Water");


        bakingManager.editItemName("Lemon Water","Spring Water");
        bakingManager.listAllStock();

        bakingManager.totalCost();

        bakingManager.removeItem("Spring Water");
        bakingManager.listAllStock();
        bakingManager.sellItem("Bumpkin Bread");
        //Profit etc sell item

        //Buy and sell Ingridiants

    //List all of Ingredients
    }
}
