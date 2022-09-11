import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1; i<=n; i++){
            int k = 0;
            for(int j =1; j<=i;j++){
                k=k+j;
                System.out.print(j);
                //System.out.print("+");
            }
            System.out.print("=");
            System.out.print(k);

            System.out.println();
        }

    }

}
