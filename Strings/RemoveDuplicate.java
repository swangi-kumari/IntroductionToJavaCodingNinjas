public class RemoveDuplicate {
    public static String removeConsecutiveDuplicates(String str) {
        //Your code goes here


        if(str.length()<=1){
            return str;
        }
        String str1 = removeConsecutiveDuplicates(str.substring(1));
        if(str.charAt(0)==str.charAt(1)){
            return str1;

        }
        else{
            return str.charAt(0)+str1;
        }

    }

    public static void main(String[] args) {
        String str = "aabcddaa";
        String ans = removeConsecutiveDuplicates(str);
        System.out.println(ans);
    }


}
