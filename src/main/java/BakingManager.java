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
        System.out.println((stock.listIngridiants(find) == null)? String.format("The Item %s You Searched For Was Not Found!", find) : "The Item " + find + " Contains: " + stock.listIngridiants(find) + "\n-----");
    }
}