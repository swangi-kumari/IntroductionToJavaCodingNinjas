import java.util.Scanner;

public class FindDuplicate {

    public static int[] takeInput(){
        Scanner s= new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for(int i = 0; i< size; i++){
            input [i] = s.nextInt();
        }
        return input;
    }


    public static int duplicateNumber(int arr[]) {
        int size = arr.length;
        int i;
        for ( i = 0; i < size-1; i++) {
            int count = 0;
            for (int j = i + 1; j < size; i++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count==1) return arr[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int [] input = takeInput();
            System.out.println(duplicateNumber(input));
           t--;
        }
    }
}
