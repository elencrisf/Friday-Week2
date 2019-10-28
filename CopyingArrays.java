package Week2.Arrays;

import java.util.Arrays;

public class CopyingArrays {

    public static void main(String[] args) {

        double myList[]  = new double[10];
        System.out.println("Integer Array: "
                + Arrays.toString(myList));

        System.out.println("\nNew Arrays by copyOf:\n");

        System.out.println("Integer Array: "
                + Arrays.toString(
                Arrays.copyOf(myList, 10)));

    }

}
