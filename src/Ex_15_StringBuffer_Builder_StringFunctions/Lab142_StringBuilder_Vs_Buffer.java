package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab142_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s0 = "Yash";
        String  s1 = new String("Yash");

        StringBuffer buf = new StringBuffer("Yash");
        StringBuilder bui = new StringBuilder("Yash");

        System.out.println(buf);
        System.out.println(bui);
        System.out.println(buf.reverse());
        System.out.println(bui.reverse());
    }
}
