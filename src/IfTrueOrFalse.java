/**
 * Created by kate on 16.01.17.
 */
public class IfTrueOrFalse {
    public static void main(String[] args) {
        ifTrueOrFalse(1);
        ifTrueOrFalse(0);
        ifTrueOrFalse(5);
    }

    private static void ifTrueOrFalse(Integer someInt){
        if (someInt == 0){
            System.out.println("False");
        }
        else {
            if (someInt == 1){
                System.out.println("True");
            }
            else {
                System.out.println("Error!");
            }
        }

    }
}
