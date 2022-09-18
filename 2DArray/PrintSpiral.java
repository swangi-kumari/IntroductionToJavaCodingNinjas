public class PrintSpiral {
    public static void spiralPrint(int matrix[][]){
        //Your code goes here
        int row = matrix.length;
        if(row==0){
            return;
        }
        int col = matrix[0].length;
        int startR = 0;
        int startCol = 0;
        int i =0;
        while(startR<row&& startCol<col){
            for(i= startCol; i< col; ++i){
                System.out.println(matrix[startR][i]+ " ");
            }
            startR++;
            for(i = startR; i<row;++i){
                System.out.println(matrix[i][col-1]+ " ");
            }
            col--;
            if(startR<row){
                for(i = col-1; i>=startCol;--i){
                    System.out.println(matrix[row-1][i]+ " ");
                }
                row--;
            }
            if(startCol<col){
                for(i = row-1; i>=startR;--i){
                    System.out.println(matrix[i][startCol]+ " ");
                }
                startCol++;
            }
        }
    }
    public static void main (String[] args)
    {
        int R = 3;
        int C = 6;
        int matrix[][] = { {1,  2,  3,  4,  5,  6},
                {7,  8,  9,  10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
        spiralPrint(matrix);
    }


}
