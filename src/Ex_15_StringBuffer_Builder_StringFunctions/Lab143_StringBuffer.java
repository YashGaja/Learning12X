package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_StringBuffer {
    public static void main(String[] args) {
        StringBuffer buf =new StringBuffer("Yash");
        buf.append("Gajabhiye");
        System.out.println(buf);
        String s1 = "Yash";
        s1 = s1+ "Gajabhiye";
        System.out.println(s1);
    }
}
