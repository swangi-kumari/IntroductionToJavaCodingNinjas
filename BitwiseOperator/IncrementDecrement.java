public class IncrementDecrement {
    public static void main(String[] args) {
//        int a= 10;
//        System.out.println(++a);
//        System.out.println(a++);
//        a++;
//        System.out.println(a);

//        int a=10,b=20;
//        System.out.println(a+++--b);//line 1
//        System.out.println(a--+++b);//line 2
//        System.out.println(a++-++b);//line 3
//        System.out.println(a+++++b);//line 4\\

//        int a=10,b=20;
//        int c=a&b;
//        System.out.print(c);
//        int d=a|b;
//        System.out.print(d);
//        int e=a^b;
//        System.out.print(e);
//        int f=c+d+e;
//        System.out.print(~f);

//        int a=10,b=-20;
//        System.out.print(a^b);

//        int a = 42;
//        int b = ~a; //(there is tilde sign before a)
//        System.out.print(a + " " + b);

//        int x = 15;
//        int y = x++;
//        int  z = ++x;
//        System.out.println(y +" " + z);

//        int x =10;
//        int y = 20;
//        if(x++ > 10 || ++y > 20 ){
//            System.out.print("Inside if  ");
//        }else{
//            System.out.print("Inside else  ");
//        }
//        System.out.println(x +" "+y);

        int a=5;
        a+=5+(++a)+(a++);
        System.out.print(a);

    }
}
