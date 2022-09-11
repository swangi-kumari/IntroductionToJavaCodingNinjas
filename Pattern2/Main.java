import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n) {
            int j=1;
            int num=2*i-1;

            while(j<=n-i+1){
                System.out.print(num);
                num=num+2;
                j++;
            }

            j=1;
            int k=1;
            while(j<=i-1){
                System.out.print(k);
                k=k+2;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
