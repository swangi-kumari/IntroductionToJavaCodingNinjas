public class ContinueDemo {
    public static void main(String[] args) {
//        for(int i=1; i<=10; i++){
//            if (i==5){
//                i++;
//                continue;
//            }
//
//            System.out.println(i);
//        }

//        int i=0;
//        for(;;)
//        {
//            if(i==5)
//                break;
//            System.out.print(i);
//            i++;
//        }


//        for(int i=7;i!=0;i--)
//        {
//            System.out.print(i--);
//        }

//        for(int i=1;;i++)
//        {   if(i>5)
//        {
//            break;
//            System.out.print("break statement reached");
//        }
//            System.out.print(i);
//        }

//        int i = 1;
//        while(i < 3) {
//            int j = 1;
//            while(j < 5) {
//                if(j == 3) {
//                    break;
//                }
//                System.out.print(j + " ");
//                j++;
//            }
//            i++;
//        }

        int i = 1;
        while(i < 3) {
            int j = 0;
            while(j < 5) {
                j++;
                if(j == 3) {
                    continue;
                }
                System.out.print(j + " ");
            }
            i++;
        }

    }
}
