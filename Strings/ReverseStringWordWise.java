public class ReverseStringWordWise {
    public static String reverseWordWise(String input) {
        // Write your code here
        String reverseString = "";
        for(int i = 0; i<input.length(); i++){
            reverseString= input.charAt(i) +reverseString;
        }
        System.out.println(reverseString);
//
        String ans ="";
        int start  =0;
        int i = 0 ;
        for( ;i<reverseString.length() ; i++){
            if(reverseString.charAt(i)==' '){
                int end = i-1;
                String reverseWord ="";
                for(int j = start; j<=end; j++){
                    reverseWord=reverseString.charAt(j) + reverseWord;
                    //System.out.println(reverseWord);
                }
                ans += reverseWord + " ";
                start=i+1;
            }
        }
        int end = i-1;
        String reverseWord ="";
        for(int j = start; j<=end; j++){
            reverseWord=reverseString.charAt(j) + reverseWord;
            //System.out.println(reverseWord);
        }
        ans += reverseWord + " ";
        return ans;
    }

    public static void main(String[] args) {
        String str = "swangi is a good girl ";
        String ans = reverseWordWise(str);
        System.out.println(ans);

    }
}
