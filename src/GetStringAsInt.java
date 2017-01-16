/**
 * Created by kate on 16.01.17.
 */
public class GetStringAsInt {
    public static void main(String[] args) {
        getStringAsInt("2");
        getStringAsInt("000890");
        getStringAsInt("HI!");
    }

    private static void getStringAsInt(String someString){
        try {
            System.out.println(Integer.valueOf(someString));
        }
        catch (java.lang.NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
