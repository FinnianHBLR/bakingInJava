import sun.awt.X11.XSystemTrayPeer;

public class StoreManager {
    //Properties
    Stock stock = new Stock();  //Instance of stock for ingredients.
    SaveLoadSendJSON saveLoadSendJSON = new SaveLoadSendJSON();

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
        //Gets old data and collects old info and compares to old then adds to statement.
        Double statementRecord = newAccountTotal - this.bankAccout;

        System.out.println(String.format("A Transaction of %f Was Recorded", statementRecord));

        saveLoadSendJSON.updateStatement(statementRecord);

        this.bankAccout = newAccountTotal;
    }

    //Buying and selling ingredients

    public String addBuyableIngredients(Double cost, String name){

        return String.format("%d of %s was added to the list at a cost of %f.", name, cost);

        //Send money to different player.
    }
}

