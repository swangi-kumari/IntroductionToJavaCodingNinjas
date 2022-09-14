import java.time.chrono.MinguoEra;

public class IntersectionOfArray {
    public static void intersections(int arr1[], int arr2[]) {
        //Your code goes here
        int size1 = arr1.length;
        int size2= arr2.length;
        int ans [] ;
        for(int i = 0; i<size1; i++){
            for(int j = 0 ; j < size2; j++){
                if(arr1[i]==arr2[j]){

                    System.out.println(arr1[i]);

                    arr1[i]= Integer.MIN_VALUE;

                }
            }
        }
    }
}
