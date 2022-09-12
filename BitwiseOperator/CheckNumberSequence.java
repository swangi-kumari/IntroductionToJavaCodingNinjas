import java.io.PrintStream;
import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pre = s.nextInt();


        boolean isDec = true;

        for (int i = 0; i < n ; i++) {
            int curr = s.nextInt();
            if (curr == pre) {
                System.out.println("false");
                return;
            }
            if (curr < pre) {
                if (!isDec) {
                    System.out.println("false");
                }
            } else {
                if (isDec) {
                    isDec = false;
                }
            }
            pre = curr;

        }
        System.out.println("true");

    }

}
