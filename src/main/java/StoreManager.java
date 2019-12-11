public class StoreManager {
    //Properties
    Stock stock = new Stock();  //Instance of stock for ingredients.

    private Double bankAccout;
    //Constructors

    public StoreManager(Double StartAmount){
        //Starting data
        this.bankAccout = StartAmount;
    }
    //Methods

    //Eftpos machine

    public Double getBankAccout() {
        return this.bankAccout;
    }
    public void setBankAccout(Double newAccountTotal) {
        this.bankAccout = newAccountTotal;
    }

    //Buying and selling ingredients

    public String addBuyableIngredients(Double cost, String name){

        return String.format("%d of %s was added to the list at a cost of %f.", name, cost);
    }
}

