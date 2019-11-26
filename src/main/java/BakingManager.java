public class BakingManager {
    //Properties
    //Creates an instance of stock
    Stock stock = new Stock();

    //Constructors

    //Methods

    public void countAllStock() {
        //Lists all current stock
        System.out.println("Currently there are "+ stock.getAmount() + " items in stock." + "\n------");

    }

    public void listAllStock() {
        System.out.println("All Items in list: \n" + stock.getAllStock() + "------");
    }

    public void findIngridiants(String find) {
        //This checks if the "Find" sting is valid, if no tels the user the input is wrong using an inline statement and String.format. Otherwise it will seach again to get listIngridiants and list those.
        System.out.println((stock.listIngridiants(find) == null)? String.format("The Item %s You Searched For Was Not Found!", find) : "The Item " + find + " Contains: " + stock.listIngridiants(find) + "\n-----");
    }

    public void addFoodItem(String foodType, String ingridiants, Double price, String itemName){
        //Adds new item using data from main
        stock.addStock(foodType, ingridiants, price, itemName);
    }

    public void editItemName(String oldName, String newName) {
        //Recives old name and upddates to new name.
        System.out.println("\n ----" + stock.editItemName(oldName, newName) + "----\n");
    }

    public void getItemPrice(String itemName){
        //Gets Item prices using an item name
        System.out.println(String.format("The item %s is worth $%f", itemName, stock.getItemPrice(itemName)));
    }

    public void totalCost() {
        //Totals all item costs together
        System.out.println(String.format("The Total Worth of Stock Currently is: $%f", stock.total() ) );
    }
}