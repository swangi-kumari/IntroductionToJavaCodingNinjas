import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int i = 1; //next no.to be added
//        int sum = 0;
//        while(i<=n){
//            sum = sum +i;
//            i++;
//
//        }
//        System.out.println(sum);

        int N = s.nextInt();
        int i = 2;
        int sum = 0;
        while(i<=N){
            if(i%2==0){
                sum= sum+i;
                i=i+2;
            }
        }
        System.out.println(sum);


    }
}
