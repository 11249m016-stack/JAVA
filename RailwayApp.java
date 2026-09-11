public class RailwayApp {
    public static void main(String[] args) {

        String[] trainCodes = {"TR101", "TR202", "TR303", "TR404", "TR505"};

        try {
            // Trying to access an invalid index
            System.out.println("Train Code: " + trainCodes[7]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid array index!");
            System.out.println("Please enter an index between 0 and 4.");
        }

        System.out.println("Program continues normally...");
    }
}