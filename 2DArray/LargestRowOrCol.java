public class LargestRowOrCol {
    public static void findLargest(int mat[][]){
        //Your code goes here
        int rows = mat.length;
        if(rows==0){
            System.out.println("row"+" 0 "+Integer.MIN_VALUE);
            return;
        }

        int cols = mat[0].length;
        int largestRow = Integer.MIN_VALUE;
        int maxIndexR = -1;
        int largestCol = Integer.MIN_VALUE;
        int maxIndexC = -1;

        int i =0;
        for(; i<cols; i++){
            int sumRow=0;
            for(int j = 0; j<cols; j++){
                sumRow = sumRow +mat[i][j];
            }
            if(sumRow > largestRow){
                largestRow = sumRow;
                maxIndexR =i;
            }
        }
        int k =0;
        for(; k<rows; k++){
            int sumCol = 0;
            for(int j =0; j<rows;j++){
                sumCol = sumCol + mat[j][k];
            }
            if(sumCol>largestCol){
                largestCol = sumCol;
                maxIndexC=k;
            }
        }

        int maxVal =Integer.MIN_VALUE;
        if(largestRow>largestCol){
            maxVal=largestRow;
        }else{
            maxVal = largestCol;
        }

        if(maxVal==largestRow){
            System.out.println("row "+ maxIndexR + maxVal);
        }else{
            System.out.println("column "+ maxIndexC + maxVal);
        }
    }
    }

