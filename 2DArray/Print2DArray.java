public class Print2DArray {
    public static void print2DArray(int input[][]) {
        // Write your code here
        int rows = input.length;
        if(rows==0){
            return;
        }
        int cols = input[0].length;
        for(int i = 0; i<rows; i++) {
              // int temp=0;
                for (int j = i; j <rows; j++) {
                   int temp = 0;
                    while (temp < cols) {
                        System.out.print(input[i][temp]);
                        temp++;
                    }
                    System.out.println();
                }
            }

        }




    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{4,5,6,9},{7,8,9,1}};
        print2DArray(matrix);
    }
}
