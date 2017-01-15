/**
 * Created by kate on 14.01.17.
 */
public class ByteShortInt {
    public static void main(String[] args) {

        byte byteValue = 15;

        short shortValue = 2500;

        int intValue = -1_675_230_333;

        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println("longValue = " + longValue);

    }
}
