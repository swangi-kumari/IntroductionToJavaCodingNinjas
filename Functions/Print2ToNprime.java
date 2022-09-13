import java.util.Scanner;

public class Print2ToNprime {
    public static boolean isPrime(int n){
        int d =2;
        while(d<n){
            if(n%d==0){
                return false;
            }
            d++;
        }
        return true;
    }

    public static void PrintPrime(int n){
        for(int i = 2; i<=n; i++){
            boolean isIPrime= isPrime(i);
            if(isIPrime){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        PrintPrime(n);
    }
}
