package Week2.Arrays;

public class FindingTheLargestValue {

    public static void main(String[] args) {

        double[] myList = new double[10];
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Largest is " + max);
    }

}
