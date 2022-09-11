import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            for (int j =i-1 ; j>0; j--){
                System.out.print(" ");
            }
            for(int j = 1; j<= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//5
//        *****
//         *****
//          *****
//           *****
//            *****

