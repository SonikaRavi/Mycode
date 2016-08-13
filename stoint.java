
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        StringBuffer sb=new StringBuffer(str);
        String s=sb.toString();
        int i=Integer.valueOf(s);
        System.out.println(i);
    }
}
