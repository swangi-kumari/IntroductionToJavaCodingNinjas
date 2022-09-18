

import java.util.Scanner;

public class ArrayUse {


    public static void main(String[] args) {
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
        for(int i=0; i<rows;i++){
            for(int j= 0; j<cols;j++){
                System.out.print(input[i][j]+" ");
                //System.out.println(i+j);
            }
            System.out.println();

        }
        int sum = 0;
        for(int i = 0; i<rows; i++){
            for(int j =0; j<cols; j++){
                sum = sum + input[i][j];
            }
            System.out.println(sum);
        }
    }
}
