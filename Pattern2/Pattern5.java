import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            int p =1;
            for(int j = 1; j <=i ; j++){
                System.out.print(p);
                p++;
            }
             p=i - 1;
            for(int j = 1; j <=i-1; j++){
                System.out.print(p);
                p--;

            }
            System.out.println();
        }
    }
}


//4
//
//           1
//          121
//         12321
//        1234321