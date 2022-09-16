public class RemoveCharacter {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // Your code goes here
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=ch){
                str2 = str2 + str.charAt(i);
            }

        }
        return str2;
    }
}


