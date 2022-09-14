public class FindUnique {

    public static int findUnique(int[] arr){
        //Your code goes here
        int size = arr.length;
        int res = 0;
        for (int i = 0; i< size; i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
//   int a = 2;
//   int c = a^0;
//        System.out.println(c);
    }
}
