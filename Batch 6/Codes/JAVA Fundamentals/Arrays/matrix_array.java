import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = 3;
        int col = 4;

        int[][] mat = new int[row][col];

        // outer loop = rows
        for (int i = 0; i < row; i++){
            // inner loop = column
            for (int j = 0; j < col; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        // outer loop = rows
        for (int i = 0; i < row; i++){
            // inner loop = column
            for (int j = 0; j < col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }


    }
}