public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To baking in Java");

        //Create a baking manager
        BakingManager bakingManager = new BakingManager();

        bakingManager.countAllStock();
        bakingManager.listAllStock();
        bakingManager.findIngridiants("Lemon Water");
        bakingManager.findIngridiants("Apple");
    }
}
