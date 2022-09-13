import java.util.Scanner;



public class FibonacciNumber {
//0 1 1 2 3
//a b c
    public static boolean isFib(int n){
      int a = 0;
      int b = 1;
      if(n==a || n ==b){
          return true;
      }
      int c = a+b;
      while(c<=n){
          a=b;
          b=c;
          c=a+b;
          if(n==c){
              return true;
          }
      }
      return false;
    }


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n =  s.nextInt();
        System.out.println(isFib(n));
    }
}
