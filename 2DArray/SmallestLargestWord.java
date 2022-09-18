public class SmallestLargestWord {
    public static void main(String[] args) {
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        String word = "", small = "";
        String[] words = new String[100];
        int length = 0;
        string = string + " ";
        for (int i = 0; i < string.length(); i++) {
            //Split the string into words
            if (string.charAt(i) != ' ') {
                word = word + string.charAt(i);
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
        System.out.println("Smallest word: " + small);
    }
}

