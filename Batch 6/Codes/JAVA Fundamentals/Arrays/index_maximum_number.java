import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] num = {10, 6, 2, 5, 1, 90, 11, 5, 0, -1};
        int n = num.length;

        int maximumNumber = num[0];
        int indexOfMaximumNumber = 0;

        for (int i = 0; i < n; i++){

            if (num[i] > maximumNumber){
                maximumNumber = num[i];
                indexOfMaximumNumber = i;
            }
        }

        System.out.println("Index of maximum number : " + indexOfMaximumNumber);
    }
}