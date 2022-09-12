import java.util.Scanner;

class BreakContinue{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       for(int i = 2; i<=n ; i++){
            boolean divide= false;
            for(int d=2; d<i; d++) {
                if (i % d == 0) {
                    divide = true;
                    break;
                }
            }
               if(!divide) {
               System.out.println(i);
            }

       }
    }
}