import com.sun.scenario.effect.impl.prism.PrRenderInfo;

import java.util.LinkedList;
import java.util.List;
import  java.math.BigDecimal; //use bigDecimal in the math libery so it wont complane

public class FoodStuff {
    //Properties
    private String foodType;
    //private String ingredients;     //NEEDS TO BE AN ARRAY

    private List<String> ingredients  = new LinkedList<>();

    private Double price;
    private String itemName;
    private Boolean soldStatus;

    //Constructors, for creating new food item object. uses methods to check if the value is valid

    public FoodStuff(String foodType, List<String> ingredients, Double price, String itemName) {
        setFoodType(foodType);
        setIngredients(ingredients);
        setPrice(price);
        this.soldStatus = false; //when an item is created it has not been sold yet. (item sold status is changed in Stock manager)
        this.itemName = itemName;
    }

    private void setFoodType(String foodType) {
        if (foodType == "") {
            this.foodType = "Miscellaneous";
        } else {
            this.foodType = foodType;
        }
    }

    private void setIngredients(List<String> ingredients) {
        if (ingredients.isEmpty()) {
            //If there is no data add No ingredients
            this.ingredients.add("No ingredients Data");
        } else {
            //Add the new ingredients to the list. THIS Adds both lists together.
            this.ingredients.addAll(ingredients);
        }
    }

    private void setPrice(Double price) {
            this.price = price;
    }

    public void setItemName(String newName) {
        this.itemName = newName;
    }

    public void setSoldStatus(Boolean newStatus) {
        this.soldStatus = newStatus;
    }

    //Methods
    public String getItemName() {
        return this.itemName;
    }

    public String getFoodType() {
        return this.foodType;
    }

    public String getIngredients() {
        //Returns Array as String
        return this.ingredients.toString();
    }

    public Double getPrice() {
        return this.price;
    }

}