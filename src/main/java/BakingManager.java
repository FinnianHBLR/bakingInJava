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
        stock.addStock(foodType, ingridiants, price, itemName);
    }
}