
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 2, 56, 1, 9};

        // In built functions of arrays in java

        // length = gives you number of elements in array
        int size = arr.length;
        System.out.println("Size of array: " + size);

        int[] brr = new int[15];
        int n = brr.length;

        // fill = it mainly fills your whole array with given value
        Arrays.fill(brr, -1);
        /*
            Above fill function internally works this way
            for (int i = 0; i < n; i++){
                brr[i] = 100;
            }
         */

        for (int i: brr){
            System.out.print(i + " ");
        }


        int[] num = {10, 6, 2, 5, 1, 90, 11, 5, 0, -1};
        int n = num.length;

        System.out.println("Before sorting");
        for (int i: num){
            System.out.print(i + " ");
        }

        // Sort the array
        Arrays.sort(num);


        System.out.println("\nAfter sorting");

        for (int i: num){
            System.out.print(i + " ");
        }

    }
}