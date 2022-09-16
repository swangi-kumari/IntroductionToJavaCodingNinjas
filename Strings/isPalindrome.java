public class isPalindrome {
    public static boolean isPalindrome(String str) {
        //Your code goes here
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        if (str.equals(reverse)) {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        String str ="abba";
        boolean ans = isPalindrome(str);
        System.out.println(ans);


    }
}
