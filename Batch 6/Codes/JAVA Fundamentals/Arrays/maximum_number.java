import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] num = {10, 6, 2, 5, 1, 90, 11, 5, 0, -1};
        int n = num.length;

        int maximumNumber = num[0];

        for (int i: num){
            if (i > maximumNumber){
                maximumNumber = i;
            }
        }

        System.out.println(maximumNumber);
    }
}