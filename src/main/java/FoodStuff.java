import java.util.List;
import  java.math.BigDecimal; //use bigDecimal in the math libery so it wont complane

public class FoodStuff {
    //Properties
    private String foodType;
    private String ingredients;
    private Double price;
    private String itemName;
    private Boolean soldStatus;

    //Constructors, for creating new food item object. uses methods to check if the value is valid

    public FoodStuff(String foodType, String ingredients, Double price, String itemName) {
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

    private void setIngredients(String ingredients) {
        if (ingredients == "") {
            this.ingredients = "No ingredients Data";
        } else {
            this.ingredients = ingredients;
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
        return this.ingredients;
    }

    public Double getPrice() {
        return this.price;
    }

}