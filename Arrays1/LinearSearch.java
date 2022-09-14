import java.util.Scanner;

public class LinearSearch {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static int linearSearch(int arr[], int x) {
        Scanner s = new Scanner(System.in);
        //
        int size = arr.length;
        for(int i = 0; i< size; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        while(testCases>0) {
            int[] arr = takeInput();
            int x = s.nextInt();
            System.out.println(linearSearch(arr, x));
            testCases--;
        }
    }
}