import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = (n/2)+1;
        int count = num-1;
        for(int i = 1; i<= num; i++){
            for(int j = 1; j<=count; j++){
                System.out.print(" ");
            }
            count--;
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
//            for(int j = 1; j<= i-1; j++){
//                System.out.print("*");
//            }
            System.out.println();
        }

        count=1;
        for(int a = 1; a<=(num-1); a++){
            for(int b = 1; b<=count; b++){
                System.out.print(" ");
            }
            count++;
            for (int b = 1; b<=(2*(num-a))-1; b++){
                System.out.print("*");
            }
//            for (int b = 1;b<=n-a-2; b++){
//                System.out.print("*");
//            }
            System.out.println();
        }

    }
}