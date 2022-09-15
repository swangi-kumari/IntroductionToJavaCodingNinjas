public class Sort012 {
    public static void sort012(int[] arr){
        //Your code goes here
        int count0 = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count0++;
        }
        int count1 = count0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1)
                count1++;
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for(int i = count0; i<count1; i++){
            arr[i]=1;
        }
        for(int i = count1; i<n; i++){
            arr[i]=2;
        }


    }

}
