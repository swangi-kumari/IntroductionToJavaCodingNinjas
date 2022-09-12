import java.util.Scanner;

public class CheckArmStrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int rem = 0;
        int temp =n;
        while(temp>0){
            rem = rem*10+temp%10;
            temp = temp/10;
            count++;
        }

        int div = 0;
        double num = 0;
        while(rem>0){
            div = rem%10;
            num = num+Math.pow(div, count);
            rem/=10;
        }

        if(num==n){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }


    }
}
