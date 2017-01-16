/**
 * Created by kate on 15.01.17.
 */
public class intAsString2 {
    public static void main(String[] args) {
        getIntAsString(2);
        getIntAsString(13);
        getIntAsString(4489003);
    }

    private static void getIntAsString(int someInt){
        System.out.println(String.valueOf(someInt));
    }
}