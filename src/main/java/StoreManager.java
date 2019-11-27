public class StoreManager {
    //Properties
    private Double bankAccout;
    //Constructors

    public StoreManager(Double StartAmount){
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

    //Selling item

}
