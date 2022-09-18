import java.util.Scanner;

public class Sorting2DArray {
    public static int [][] takeInput(){
        Scanner s  = new Scanner(System.in);
        System.out.println("enter rows");
        int rows  = s.nextInt();
        System.out.println("enter columns");
        int cols = s.nextInt();
        int input[][]=new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j =0; j<cols;j++){
                System.out.println("enter at "+ i + "row "+ j+ "cols.");
                input[i][j]=s.nextInt();
            }
        }
        return input;
    }

    public static void print(int [][] input){
        int rows = input.length;
        int cols = input[0].length;

        for(int i=0; i<rows;i++){
            for(int j= 0; j<cols;j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();

        }
    }

    public static int largestColSum(int input[][]){
        int largest = Integer.MIN_VALUE;
        int rows = input.length;
        int cols = input[0].length;
        for(int j = 0; j<cols; j++){
            int sum=0;
            for(int i = 0; i<cols; i++){
                sum = sum +input[i][j];
            }
            if(sum > largest){
                largest = sum;
            }
        }
        System.out.println("largest" + largest);
        return largest;

    }

    public static void main(String[] args) {

//        int[][] arr2;
//        arr2 = new int[][]{{1,2,3},{4,5,6}};
//        print(arr2);
//        System.out.println(arr2.length);
//        for(int i =0 ;i<2;i++){
//            System.out.println(arr2[i].length);
//        }
        int input [][]=takeInput();
        print(input);
        System.out.println("Largest column sum :"+ largestColSum(input));

    }
}
