
import java.util.Scanner;

public class RowWiseSum {

    public static void rowWiseSum(int[][] mat) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = s.nextInt();
            }
        }

            int sum, i, j;
            for (i = 0; i < mat.length; i++) {
                sum = 0;
                for (j = 0; j < mat[i].length; j++) {
                    sum = sum + mat[i][j];
                }
                System.out.println(sum + " ");
            }




    }
}

