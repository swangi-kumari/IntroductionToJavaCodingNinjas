import java.util.Scanner;

public class SwapAlternate {


    public static int[] takeInput(){
        Scanner s= new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for(int i = 0; i< size; i++){
            input [i] = s.nextInt();
        }
        return input;
    }

    public static void swapAlternate(long arr[]) {
        //Your code goes here
        //2 3 4 5 6 7
        int size = arr.length;
        for(int i = 0; i< size; i= i+2){
            long temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int [] arr = takeInput();
       // swapAlternate(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
