public class RotateArray {
    public static void rotate(int[] arr, int d) {
        //Your code goes here
        int n = arr.length;

        while(d>0){
            for(int i = 1; i< n; i++){
                int temp = arr[0];
                arr[i]= arr[i-1];
                arr[0]=arr[arr.length];
                d--;
                //temp++;
            }
        }


    }

}
