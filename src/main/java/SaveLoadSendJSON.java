//import netscape.javascript.JSObject; Different library
import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class SaveLoadSendJSON {

    //SAVE
    //Only one statement so must be static

    private static List<Double> statement = new ArrayList<>();

    public static void saveGameState() throws Exception {
        //Makes sure program is aware this could cause an exception


        JSONObject newObject = new JSONObject();
        //BANK ACCOUNT
        //Creates a bank account, this would be entered by user at start of game.
        newObject.put("UserBankAccount1", "1");
        newObject.put("CurrentAmount", BakingManager.storeManager.getBankAccout());

        //STATEMENT
        //NOTE: Could use a JSONArray but, nah. Instead just get the array and place inside of JSON file, in theory should be the same.
        newObject.put("Statement", getStatement());


        //INGREDIENTS
        Gson gson = new Gson(); //Converts Objects using gjson!

        newObject.put("IngredientsInStock", gson.toJson(IngredientsManager.ingredientStock));

        //BUYABLE
        newObject.put("Buyalbeingredients", gson.toJson(IngredientsManager.buyableIngredients));

        //STOCK Of Crated Items
        newObject.put("SellableItems", gson.toJson(Stock.getAllStock()));

        //Writes File.
        Files.write(Paths.get("gameSave.JSON"), newObject.toJSONString().getBytes());


    }
    //Method for adding to statement on eftpos

    public void updateStatement(Double newRecord) {
        this.statement.add(newRecord);
        //Whenever a transaction is processed this will update the array.

    }

    public static List<Double> getStatement(){
        return statement;
    }

    //LOAD, STOCK, BUYABLE, INGRIDIANTS
    //Will use gjson to load files.


}
