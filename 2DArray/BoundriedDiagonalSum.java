public class BoundriedDiagonalSum {

    public static void totalSum(int[][] mat) {
        //Your code goes here
        int N = mat.length;

        int requiredSum = 0;


        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                if (i == j || (i + j) == N - 1  || i == 0 || j == 0 || i == N - 1 || j == N - 1 ) {
                    requiredSum += mat[i][j];
                }

            }
        }
    }
}
