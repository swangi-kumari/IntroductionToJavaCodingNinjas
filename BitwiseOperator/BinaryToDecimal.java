import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        int sum = 0;
        for(int i = n; i>0; i/=10){
            int digit = i%10;
            int ans = (int) (digit * Math.pow(2, count));
            sum = sum + ans;
            count++;
        }

        System.out.println(sum);
    }
}
