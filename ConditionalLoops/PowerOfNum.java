import java.util.Scanner;
public class PowerOfNum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        long pow = 1;
        while(n!=0){
            pow = (pow*x);
            n--;
        }
        System.out.println(pow);

    }
}
