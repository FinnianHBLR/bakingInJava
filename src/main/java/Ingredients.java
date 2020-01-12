import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ingredients {

        //Properties. FOR INDIVIDUAL ITEMS.
        private Double costOfIngredient;
        private String nameOfIngredient;
        private int amount;

        //Constructors
        public Ingredients(Double cost, String name, int amount) {
            //Could put things in here for invalid data
            this.costOfIngredient = cost;
            this.nameOfIngredient = name;
            this.amount = amount;
        }
        //Methods


    //Return list of allbuyable items

        public void setCostOfIngredient(Double cost) {
            this.costOfIngredient = cost;
        }
        public void setNameOfIngredient(String name) {
            this.nameOfIngredient = name;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public Double getCostOfIngredient(){
            return costOfIngredient;
        }
        public String getNameOfIngredient(){
            return nameOfIngredient;
        }

        public int getAmount() {
            return amount;
        }

    }
