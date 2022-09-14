public class sortZeroesAndOne {

    public static void sortZeroesAndOne(int[] arr) {
        //Your code goes
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }


        for (int i = 0; i < count; i++)
            arr[i] = 0;


        for (int i = count; i < n; i++)
            arr[i] = 1;
    }
}
