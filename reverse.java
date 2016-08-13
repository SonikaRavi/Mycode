import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner in=new Scanner(System.in);
        int i;
        String str;
        StringBuffer sb;
        str=in.nextLine();
            sb=new StringBuffer(str);
            sb.reverse();
            System.out.print(sb);
        
    }
}
