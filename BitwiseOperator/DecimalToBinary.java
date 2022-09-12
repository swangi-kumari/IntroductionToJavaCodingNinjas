import java.awt.*;
import java.util.Scanner;

class DecimalToBinary{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long count=1;
        long binary=0;
        for(int i = n; n>0; n=n/2){
            int ans = n%2;
            binary=binary+(ans*count);
            count*=10;
        }
        System.out.println(binary);
        }

    }



















