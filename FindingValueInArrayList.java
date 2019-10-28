package Week2.ArraysLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindingValueInArrayList {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            myArrayList.add(scanner.nextLine());
        }
        System.out.println("Largest element : " + Collections.max(myArrayList));
    }
}
