import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int mul = 0;
        while (i<=10){
            mul=i*n;
            i++;
            System.out.println(mul);
        }

    }
}
