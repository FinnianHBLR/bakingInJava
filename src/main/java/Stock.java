import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_it;

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

    public Stock() {
        //This is where a new thing would be added to the list.
       allStock.add(new FoodStuff("Drink ", "Water, Lemon", 1.0, "Lemon Water"));
       allStock.add(new FoodStuff( "Bakery", "Flower, Sugar and Milk", 5.0, "Bumpkin Bread"));
    }


    //Methods

    public int getAmount() {
        int tempCount = 0;

        for (FoodStuff item : allStock) {
            tempCount++;
        }
        return tempCount;
    }

}
