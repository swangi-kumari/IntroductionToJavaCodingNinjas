public class HighestOccurringCharacter {
    static final int ASCII_SIZE = 256;
    public static char highestOccuringChar(String str) {
        int count[] = new int[ASCII_SIZE];
        for(int i = 0; i< str.length(); i++){
            count[str.charAt(i)]++;
        }
        int max = -1;
        char ans = ' ';

        for(int i =0; i<str.length(); i++){
            if(count[str.charAt(i)]>max){
                max= count[str.charAt(i)];
                ans = str.charAt(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "aaaaabbbasdddfffghfenjnejcnncwjenssssssssssss";
        System.out.println(highestOccuringChar(str));
    }

}
