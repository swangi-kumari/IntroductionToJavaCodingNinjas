import java.util.Scanner;

public class Pattern11111 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i<=n; i++){
           // int start = i;

            for(int j =1; j<=i; j++){
                //char ch = (char)(' );
                char start = (char)('A'+i-1);

                System.out.print(start);
                start++;
            }
            System.out.println();
            //System.out.print(i);


        }
    }
}
