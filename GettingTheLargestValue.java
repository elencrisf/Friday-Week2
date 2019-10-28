package Week2.ArraysLists;

import java.util.ArrayList;
import java.util.Collections;

public class GettingTheLargestValue {

    public static void main(String[] args) {

        int n = 10;
        ArrayList<Integer> myArrayList = new ArrayList<Integer>(n);

        for (int i=1; i<=n; i++) {
            myArrayList.add(i);
        }
        System.out.println("Enter with the number: " + Collections.max(myArrayList));
    }
}
