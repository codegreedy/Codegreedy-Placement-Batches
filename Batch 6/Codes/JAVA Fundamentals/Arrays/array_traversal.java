import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 2, 59};
        int n = 6;

        // traversing loop
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
        // but when you don't care about the
        // index of elements of array
        // make use of = forEach Loop
        for (int i: arr){
            System.out.print(i + " ");
        }

    }
}