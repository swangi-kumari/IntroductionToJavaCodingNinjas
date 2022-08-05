import java.util.Scanner;
public class TotalSalary {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);

        int BasicSalary = s.nextInt();
        String str = s.next();
        char ch = str.charAt(0);

        double hra =  (BasicSalary * 0.2);
        double da =  (BasicSalary * 0.5);
        double pf =  (BasicSalary * 0.11);

        double allow = 0;
        if(ch == 'A'){
            allow = 1700;
        } else if (ch == 'B'){
            allow =  1500;
        } else{
            allow =  1300;
        }
        int totalSalary = (int) Math.round(BasicSalary + hra + da + allow - pf);
        System.out.println(totalSalary);

    }
}
