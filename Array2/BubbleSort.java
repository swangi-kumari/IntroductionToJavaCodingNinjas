public class BubbleSort {



    public static void bubbleSort(int[] arr){
        //Your code goes here
        int n = arr.length;
        for(int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                int temp = arr[i];
                if (arr[i] < arr[i -1 ]) {
                    arr[i] = arr[i -1];
                    arr[i -1] = temp;
                }
            }
        }


    }
}
