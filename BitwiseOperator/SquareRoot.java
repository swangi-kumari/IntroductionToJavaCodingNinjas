import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int sqrRoot= (int) Math.sqrt(n);
        System.out.println(sqrRoot);
    }
}
