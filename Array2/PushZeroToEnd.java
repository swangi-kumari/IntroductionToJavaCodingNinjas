public class PushZeroToEnd {
    public static void pushZerosAtEnd(int[] arr) {
        //Your code goes here
        //int ans[] = new int[arr.length];

        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                arr[count++]=arr[i];
        }
        while(count<n){
            arr[count++]=0;
        }

    }

}
