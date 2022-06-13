import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        double f = s.nextInt();
//        double cel = ((5.0)*(f-32.0))/9;
//        System.out.println(cel);
//        System.out.println(9.0/5);
//        System.out.println(9%5); //remainder
//        System.out.println('A' + 1); //print ascii value of a +1
//
//        char c = 'a';
//        char i = (char)(c+3);
//        System.out.println(i);


        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        int Cel = 0;
        while(S<=E){
            Cel = ((S-32)*5)/9;
            S= W+13;
        }
        System.out.println(S+" "+Cel);
    }
}
