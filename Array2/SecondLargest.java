public class SecondLargest {

    public static int getLargest(int[] arr, int n){
        n = arr.length;
        int largest = 0;
        for(int i = 1; i< n ; i++){
            if(arr[i]>arr[largest]){
                largest=i;
            }
        }
        return largest;
    }

    public static int secondLargestElement(int[] arr) {
        //Your code goes here
        int n= arr.length;
        int largest = getLargest(arr, n);
        int ans = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i]!=arr[largest]){
                if(ans== Integer.MIN_VALUE) {
                    ans = i;
                }
                else if(arr[i]>arr[ans]){
                    ans =i;
                }
            }
        }
        return ans;

    }

}
