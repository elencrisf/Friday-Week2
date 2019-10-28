package Week2.ArraysLists;


import java.util.ArrayList;


public class BasicArrayLists2 {

    public static void main(String[] args) {

        int n = 10;
        ArrayList<Integer> myArrayList = new ArrayList<Integer>(n);

        for (int i=1; i<=n; i++) {
            myArrayList.add(i);
        }
        System.out.println(myArrayList);
    }
}
