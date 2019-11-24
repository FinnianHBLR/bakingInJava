import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_it;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Stock {
    //THIS is where food is kept
    static List<FoodStuff> allStock = new ArrayList<>();

    //Properties
    private String itemName;
    private String ingredients;
    private int amount;

    //Constructors, this is for adding to the list. Baking manager will create new items. This will not set the requirements

    public void addStock(String foodType, String ingredients, Double price, String itemName) {
        //This is where a new thing would be added to the list.
        allStock.add(new FoodStuff(foodType, ingredients, price, itemName));

        /*
       allStock.add(new FoodStuff("Drink ", "Water, Lemon", 1.0, "Lemon Water"));
       allStock.add(new FoodStuff( "Bakery", "Flower, Sugar and Milk", 5.0, "Bumpkin Bread"));
         */
    }


    //Methods

    public int getAmount() {
        int tempCount = 0;

        for (FoodStuff item : allStock) {
            //This sums up all items
            tempCount++;
        }
        return tempCount;
    }

    public String getAllStock() {
        String collection = "";

        //int count = 0;
        //for (int i = 0; i < allStock.size(); i++ ) {
        //}
        for (FoodStuff eachItem: allStock) {
            //count++;

            //This prints out all items making a new line for each item.
            collection += eachItem.getItemName() +"\n";

            //    String edit = (count == allStock.size()) ? "." : ", ";
        }
        return collection;
    }
    public String listIngridiants(String itemName) {
//A try catch could be used if a user put in a number for example

        for (FoodStuff eachItem: allStock) {

            if(itemName == eachItem.getItemName()) {
                /*System.out.println("PASS Looking for: " + itemName);
                System.out.println("PASS Comparing To: " +eachItem.getItemName()); */
                return "\n" + eachItem.getIngredients();
            } else {
                /*System.out.println("FAIL Looking for: "+ itemName);
                System.out.println("FAIL Comparing To: " + eachItem.getItemName()); */
                //THIS CAUSES AN ERROR. This ends to loop before it can look at a second itme. return null;
            }
        }
        return null;
    }

}