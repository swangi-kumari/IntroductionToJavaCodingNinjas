public class StringBufferDemo {
    public static void main(String[] args) {
//        StringBuffer str= new StringBuffer("abc");
//        str.setCharAt(0,'b');
//        str.append("def");
//        System.out.println(str + " "+ str.length());
//        String s ="d";
//        for(int i =0;i<5;i++){
//            s = s+"z";
//            System.out.println(s);
//        }
        StringBuffer str1=new StringBuffer("");
        for(int i=0;i<5;i++)
        {
            str1.append((char)('a'+i));
        }
        System.out.println(str1);
    }

}
