import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class IngredientsManager {

    //This is where buyable items are kept
    static List<Ingredients> buyableIngredients = new ArrayList<>();

    //This is where ingredients are kept that have been purchased
    static  List<Ingredients> ingredientStock = new ArrayList<>();


    //Add buyable item

    public String addBuyableIngredient(String name, Double cost) {
        //Adds item to the list above so it is now avaliable to buy from the retailer.
        buyableIngredients.add(new Ingredients(cost, name, 0));
        //Returns the item added to the list
        return String.format("Buyable Item %s At the Prie of %f was added",name, cost);
    }


    //Buy and sell ingredients & list all current iIngredients and what can be made? (Will require a cooking class)
    public String buyIngredients(String name, int amountToBuy) {
        Double tempPrice = 0.0;
        //calculates how much to charge
        for (Ingredients selectedIngredient: buyableIngredients) {
            //gets the price and times it
            if (selectedIngredient.getNameOfIngredient() == name) {
                tempPrice = selectedIngredient.getCostOfIngredient() * amountToBuy;
                //After price is calculated charge store.
                //This below sets the bank account be getting the bank account then taking away the calculated price then setting the bank account.
                BakingManager.storeManager.setBankAccout(BakingManager.storeManager.getBankAccout() - tempPrice);

                //Add Ingredient to list. Gets data from selectedIngredient and copies to new object. Bank is charged and this item is added.
                ingredientStock.add(new Ingredients(selectedIngredient.getCostOfIngredient(), selectedIngredient.getNameOfIngredient(), amountToBuy));

                //Returns how many of an item was bought and what price
                return String.format("%d of %s was bought and the total is %f. Your Current bank accout is at %f", amountToBuy, name, tempPrice, BakingManager.storeManager.getBankAccout());
            }
        }
        //Returns null if the if statement could not find anything.
        return null;
    }

    public String listAllIngredients(){     //List all Ingredients in stock
        StringBuilder tempName = new StringBuilder();
        for (Ingredients selectedIngredient: ingredientStock) {
            //Adds stings together and adds spaces to separate them.
            tempName.append(selectedIngredient.getNameOfIngredient()).append("-X").append(selectedIngredient.getAmount()).append(" ");
        }
        return tempName.toString();
    }

    public static boolean isCookable(List<String> ingredientsToCheck) {
        //I call this next one...The Logic bomb...Observe.

        //Controlled in bakingmanager

        https://howtodoinjava.com/java/collections/arraylist/compare-two-arraylists/


//        4. Compare two arraylists – find common elements

        return allowBake;
    }

    public static void removeIngredients(List<String> ingredientsToRemove) {



    }


}
