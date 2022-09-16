public class AllSubstring {
    public static void printSubstrings(String str) {
        //Your code goes here
        //Method 1:
//        for(int i = 0; i<str.length(); i++){
//            for(int j = i+1; j<str.length()+1; j++){
//                System.out.println(str.substring(i, j));
//            }
//        }
        //Method 2:
        for(int len = 1; len<=str.length(); len++){
            //Print all Substring with length "len"
            for(int start= 0; start<=str.length()-len; start++){
                int end = start+len;
                System.out.println(str.substring(start, end));
            }

        }
    }

    public static void main(String[] args) {
       String str ="abc";
       printSubstrings(str);
    }
}
