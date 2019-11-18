public class stock {
    //THIS is where food is kept
    //Properties
    private String itemName;
    private String ingredients;
    private int amount;


    //Constructors, this is for adding to the list. Baking manager will create new items. This will not set the requirements

    public stock() {}


    //Methods
    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String name) {
        this.itemName = name;
    }


    public int getAmount() {
    return amount;
    }

}
