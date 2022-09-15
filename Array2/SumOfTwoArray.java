public class SumOfTwoArray {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry =0;
        int s= 0;
        int k = output.length-1;
        while (j >= 0) {
            s = arr1[i] + arr2[j] + carry;
            output[k] = (s % 10);
            carry = s / 10;
            k--;
            i--;
            j--;
        }
        while (i >= 0) {
            s = arr1[i] + carry;
            output[k] = (s % 10);
            carry = s / 10;
            i--;
            k--;
        }
        int ans = 0;

        // If there is carry on adding 0 index
        // elements  append 1 to total sum.
        if (carry == 1)
            ans = 10;

        // Converting array into number.
        for ( i = 0; i <= i - 1; i++) {
            ans += output[i];
            ans *= 10;
        }


    }
}
