import java.util.Scanner;

public class ReturnArraySum {

    public static int[] takeInput(){
        Scanner s= new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for(int i = 0; i< size; i++){
            input [i] = s.nextInt();
        }
        return input;
    }
    public static void PrintSum(int[] input){
        int size = input.length;
        int sum = 0;
        for(int  i=0; i<size;i++){
            sum= sum + input[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
       while(testCases>0) {
           int[] sum = takeInput();
           PrintSum(sum);
           testCases--;
       }
    }
}
