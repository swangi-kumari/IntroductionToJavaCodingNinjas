import java.util.Scanner;
public class SumOfEvenOdd {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int sum_e =0;
        int sum_o =0;
        while(N>0) {
            if ((N % 10) % 2 == 0) {
                sum_e = sum_e + N % 10;
            } else {
                sum_o = sum_o + N % 10;
            }
            N = N / 10;
        }
        System.out.println("Sum of odd");
        System.out.println(sum_o);
        System.out.println("Sum of even");
        System.out.println(sum_e);
    }
}
