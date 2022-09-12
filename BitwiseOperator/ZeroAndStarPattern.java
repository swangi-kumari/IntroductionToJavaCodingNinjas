import java.util.Scanner;

public class ZeroAndStarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++) {
            int j;
            for (j = 1; j <= n; j++) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            j--;
            System.out.print("*");
            while (j >= 1) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print("0");
                j--;
            }
            System.out.println("");
        }
    }
}



//



//
//        *000*000*
//        0*00*00*0
//        00*0*0*00
//        000***000
// while (j >= 1) {
//                    if (i == j)
//                        System.out.print("*");
//                    else
//                        System.out.print("0");
//                    j--;
//
//                }