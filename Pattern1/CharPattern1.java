import java.util.Scanner;

public class CharPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
}
