import java.util.Scanner;

public class ArrangeNumberInArray {
    public static void arrange(int[] arr, int n) {
        //Your code goes here
        int size = arr.length;

        for(int i = 0; i<size/2; i++){
            arr[i] = arr[i]+2;
        }
        for(int j = size; j< size/2; j--){
            arr[j] = 2;
            arr[j] = arr[j] +2;
        }
    }

}