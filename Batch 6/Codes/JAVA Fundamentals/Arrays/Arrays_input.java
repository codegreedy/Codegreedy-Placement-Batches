import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // step 1 = first get the size of array
        int size = sc.nextInt();

        // step 2 = declare the array
        int[] arr = new int[size];

        // step 3 = take the input from user
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

    }
}