public class MinimumLengthWord {
    public static String minLengthWord(String input){

        // Write your code here
        int n = input.length();
        String ans = "";
        String word = "", small = "";
        int length = 0;
        String[] words = new String[100];

        for (int i = 0; i < n; i++) {
            //Split the string into words
            if (input.charAt(i) != ' ') {
                word = word + input.charAt(i);
            } else {
                words[length] = word;
                length++;
                word = "";
            }
        }
        small =  words[0];

        //Determine smallest and largest word in the string
        for (int k = 0; k < length; k++) {
            if (small.length() > words[k].length())
                small = words[k];

        }
        return small;
    }
    }

