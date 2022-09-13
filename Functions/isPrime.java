import java.util.Scanner;

public class isPrime {

    public static boolean isPrimeCheck(int n){
        int d =2;
        while(d<n){
            if(n%d==0){
                return false;
            }
            d++;
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        boolean ans = isPrimeCheck(n);
        System.out.println(ans);
    }
}
