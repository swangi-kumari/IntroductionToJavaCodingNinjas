public class CountWords {
    public static int countWords(String str) {
        //Your code goes here
        int count = 1;
        String str2= " ";
        for(int i=0; i<str.length();i++){
            String str1 = String.valueOf(str.charAt(i));
            if(str2.equals(String.valueOf(str.charAt(i)))){
                count++;
            }
        }
        if(str.length()==0){
            return 0;
        }
        return count;
    }
}
