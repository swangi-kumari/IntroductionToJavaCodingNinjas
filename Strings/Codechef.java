import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int a = s.nextInt();
            int b = s.nextInt();
            while(a<=b) {
                int i = 1;
                while (a<=b){
                    if (i % 2 == 0) {
                        a = a + 2;
                        if(a==b){
                            System.out.println("yes");
                            if(a%2==0) {
                                a = a + 1;
                            }else {
                                a= a+2;
                            }
                        }

                    } else {
                        a = a + 1;
                        if(a==b){
                            System.out.println("yes");
                            if(a%2==0) {
                                a = a + 1;
                            }else{
                                a= a+2;
                            }
                        }
                    }
                    i++;
                }
            }
            //System.out.println(a);

            if(a%2==0){
                System.out.println("no");
            }
            t--;
        }

    }
}
