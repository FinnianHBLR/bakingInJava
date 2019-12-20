//import netscape.javascript.JSObject; Different library
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

    public static void writeToJSON(Double currentbankAccount) throws Exception {
        //Makes sure program is aware this could cause an exception
        JSONObject newObject = new JSONObject();
        //Save bank account
        //Creates a bank account, this would be entered by user at start of game.
        newObject.put("UserBankAccount1", "1");
        newObject.put("CurrentAmount", currentbankAccount);

        JSONArray statemnet = new JSONArray();

        statemnet.add(getStatement());

        newObject.put("Statement", statemnet);

        Files.write(Paths.get("gameSave.JSON"), newObject.toJSONString().getBytes());


    }
    //Method for adding to statement on eftpos

    public void updateStatement(Double newRecord) {
        this.statement.add(newRecord);

    }

    public static List<Double> getStatement(){
        return statement;
    }

    //LOAD



}
