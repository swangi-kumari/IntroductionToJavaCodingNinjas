import java.util.Scanner;

public class factors {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int out = 0;
        int i = 2;
        while( i<n) {
            if (n % i == 0) {
                out =  i;
                System.out.print(out + " ");
            }
            i++;
        }
    }
}
