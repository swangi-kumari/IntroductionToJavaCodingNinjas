
//VVI

import java.util.Scanner;

public class TrianglePattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //int i = 1;


        for(int i = n; i>=1; i--){

            for( int j = i; j<=n; j++){

                System.out.print((char)('A'+j-1));

            }
            System.out.println();
        }



    }
}
