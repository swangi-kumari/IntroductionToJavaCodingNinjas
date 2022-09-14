import java.util.Scanner;

public class PairSum {

    public static int pairSum(int arr[], int x) {
        //Your code goes here
        //Scanner s = new Scanner(System.in);
        //x = s.nextInt();
        int size= arr.length;

        int count = 0;
        for (int i = 0; i< size ; i++){
            for(int j = 0; j< size; j++ ){
                if (arr[i]+arr[j] == x){
                    count ++;

                }
            }

        }


        return count;
    }
}
