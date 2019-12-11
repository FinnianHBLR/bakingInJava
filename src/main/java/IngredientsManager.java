import java.util.ArrayList;
import java.util.List;

public class IngredientsManager {

    //This is where buyable items are kept
    static List<Ingredients> buyableIngredients = new ArrayList<>();

    //This is where ingredients are kept that have been purchased
    static  List<Ingredients> ingredientStock = new ArrayList<>();


    //Add buyable item

    public void addBuyableIngredient(String name, Double cost) {
        //Adds item to the list above so it is now avaliable to buy from the retailer.
        buyableIngredients.add(new Ingredients(cost, name, 0));
    }


    //Buy and sell ingredients & list all current iIngredients and what can be made? (Will require a cooking class)
    public void buyIngredients(Double cost, String name, int amount) {

        //Adds new object to list.
        ingredientStock.add(new Ingredients(cost, name, amount));
    }
}
