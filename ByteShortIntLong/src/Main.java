import java.sql.Wrapper;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        // What can we store in an int?
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + myMinLongValue);
        System.out.println("long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;

        System.out.println(bigLongLiteralValue);
    }
}
        /* Wrapper classes are used for all eight primitive types. For "int"
        we can use Integer and that allows us to perform operations on an int. */

        /* The "Busted MAX value" = -2147483648 and this was caused due to an "overflow"
        because the integer is too large.*/

        /* The "Busted MIN value" = 2147483647 and this was caused due to an "underflow"
        because the integer was too small.*/

        /* It's important to know that certain data types take up more space than others...
        Byte = 8 bits, short = 16 bits and an int = 32 bits. */