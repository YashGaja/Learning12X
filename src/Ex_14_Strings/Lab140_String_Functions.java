package Ex_14_Strings;

public class Lab140_String_Functions {
    public static void main(String[] args) {
        //  String s1 = "HELLO";  // at String Constant Pool (SCP)
        //  String s2 = new String ("WORLD");  // at Object Area (OA)

        String str1 = "HELLO";
        String str2 = "HELLO";
        String str3 = new String("HELLO");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
        System.out.println(str1.equals(str3));  // content is same
        System.out.println(str1.concat("hELLO"));

    }

}
