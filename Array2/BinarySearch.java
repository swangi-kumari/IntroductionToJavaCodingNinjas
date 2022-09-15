public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        //Your code goes here
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(x<arr[mid]) {
                end = mid - 1;
            }
            else if(x>=arr[mid]){
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;


    }
}
