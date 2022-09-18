public class LeaderInArray {
    public static void leaders(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
      //  3 12 34 2 0 -1
        int n = input.length;
        for (int i = 0; i < n; i++) {
            boolean ans = false;
            for (int j = i + 1; j < n; j++) {
                if (input[i] < input[j]) {
                    ans = true;
                    break;
                }
            }
            if (ans == false) {
                System.out.println(input[i]);
            }
        }


    }
}
