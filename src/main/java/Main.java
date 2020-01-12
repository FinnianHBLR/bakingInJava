import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class Main {
    public static void main(String[] args) throws Exception {
        //System.out.println("Welcome To baking in Java");

        //Create a baking manager
        BakingManager bakingManager = new BakingManager();
        IngredientsManager ingredientsManager = new IngredientsManager();


        System.out.println(ingredientsManager.addBuyableIngredient("Flour", 5.0));
        System.out.println(ingredientsManager.addBuyableIngredient("Water", 3.50));
        System.out.println(ingredientsManager.addBuyableIngredient("Lemon", 2.00));
        System.out.println(ingredientsManager.addBuyableIngredient("Sugar", 3.0));

        System.out.println(ingredientsManager.buyIngredients("Flour", 10));
        System.out.println(ingredientsManager.buyIngredients("Sugar", 10));
        System.out.println(ingredientsManager.buyIngredients("Water", 10));
        System.out.println(ingredientsManager.buyIngredients("Lemon", 10));

        System.out.println("Currently Ingredients stock there is: " + ingredientsManager.listAllIngredients());

        //Uses Arrays.asList to set Array. This was annoying.
        bakingManager.addFoodItem("Bread", Arrays.asList("Water", "Sugar", "Flower"), 5.0, "Bumpkin Bread");
        bakingManager.addFoodItem("Drink", Arrays.asList("Water", "Lemon", "Sugar"), 10.0, "Lemon Water");

        bakingManager.listAllStock();

        bakingManager.countAllStock();
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
        
        //Buy Item so there is something for gjson to output as the others are sold or removed
        bakingManager.addFoodItem("Wrap", Arrays.asList("Flour", "Water", "Chicken", "source"), 6.0, "Chicken Wrap");
        //Profit etc sell item

        //Buy and sell Ingredients
        //Average sales
        //List all of Ingredients

        //save load and send data. NEEDS TRY CATCH
        SaveLoadSendJSON.saveGameState();

    }
}
