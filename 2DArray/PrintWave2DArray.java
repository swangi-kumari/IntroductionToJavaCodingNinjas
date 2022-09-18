/*
Print Like a Wave***

For a given two-dimensional integer array/list of size (N x M),
print the array/list in a sine wave order, i.e,
print the first column top to bottom,
next column bottom to top and so on.
 */

public class PrintWave2DArray {

    public static void wavePrint(int mat[][]){
        //Your code goes here

        int rows = mat.length;
        if(rows==0){
            return ;
        }
        int cols = mat[0].length;
        int i, j =0;
        while(j<cols){
            if(j%2==0){
                for(i= 0;i<rows;i++){
                    System.out.print(mat[i][j]+ " ");
                    if(i==(rows-1)){
                        break;
                    }
                }
                j++;

            }else{
                for(i=rows-1; i>=0;i--){
                    System.out.print(mat[i][j]+ " ");
                    if(i==0){
                        break;
                    }
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array2D = {};
        wavePrint(array2D);

    }
}
