import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_it;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Stock {

    //Properties

    //THIS is where food is kept
    static List<FoodStuff> allStock = new ArrayList<>();


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
                //THIS CAUSES AN ERROR. This ends to loop before it can look at a second item. return null;
            }
        }
        return null;
    }

    public String editItemName(String oldName, String newName){
        //This method takes in a newName and an oldName. Once the object has been found using hte findItem method this will set the name to a new one.
        findItem(oldName).setItemName(newName);
        return String.format("%s was set to %s", oldName, newName);
    }

    //This returns an item to be edited
    public FoodStuff findItem(String name) {
        try{
            for (FoodStuff eachItem: allStock) {
                if(eachItem.getItemName() == name) {
                    return eachItem;
                }
            }
            return null;
        } catch (Exception e) {
            System.out.println("Find Error");
            return null;
        }
        //For each item this will compare names and return the object that has the same name. If not this will return null.

    }

    public Double getItemPrice(String itemName) {
        //Finds items again and gets price of that item then that is returned.
        return findItem(itemName).getPrice();
    }

    public Double total() {
        //Gets each item and records price then that is added to a temp int and returned.
        Double tempCost = 0.0;

        for (FoodStuff eachItem: allStock) {
           tempCost += eachItem.getPrice();
        }
        return tempCost;
    }


    //Remove method

    public void removeItem(String itemToRemove) {
        //Finds and returns the object to be removed from the list.
        allStock.remove(findItem(itemToRemove));
    }

    public void sellAndRemoveItem(){

    }
}