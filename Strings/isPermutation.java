import java.util.Scanner;

public class isPermutation {
    public static boolean isPermutation(String str1, String str2) {
        //Your code goes here
        if (str1.length()!=str2.length()){
            return false;
        }
//        for(int i = 0; i<str1.length(); i++){
//            for(int j = 0; j<str2.length(); j++){
//                if(str1.charAt(i)!=str2.charAt(j)){
//                    return false;
//                }
//            }
//        }
        int ans = 0;
        for(int i = 0; i< str1.length(); i++){
            ans = ans ^ str1.charAt(i)^str2.charAt(i);

        }
        return ans ==0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        boolean ans = isPermutation(str1,str2);
        System.out.println(ans);

    }
}
