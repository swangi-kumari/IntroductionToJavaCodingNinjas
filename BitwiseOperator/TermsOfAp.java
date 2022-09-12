import java.util.Scanner;

public class TermsOfAp {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
           int x = s.nextInt();
            for(int i = 1; i<=x; i++){
                int ans = 3*i+2;
                if(ans%4==0){
                    x++;
                    continue;
                }else{
                    System.out.println(ans);
                }
            }

    }
}
