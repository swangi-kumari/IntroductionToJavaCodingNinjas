public class CheckArrayRotation {
    public static int arrayRotateCheck(int[] arr) {
        //Your code goes here
        if (arr.length == 0)
            return 0;

        int index = 0;
        int min = arr[index];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

}
