import java.util.Scanner;

public class CodechefString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            String str1  = s.next();
            String str2 = s.next();
            int count = 0;
            for(int i = 0 ; i< str1.length(); i++){
                String tempI = String.valueOf(str1.charAt(i));
                for(int j = 0; j< str2.length(); j++){
                    String tempJ = String.valueOf(str2.charAt(j));
                    if(tempI.equals(tempJ)){
                        System.out.println(str1.charAt(i));
                        count++;
                    }
                }
            }
            System.out.println(n - count);

            t--;
        }

    }

}
