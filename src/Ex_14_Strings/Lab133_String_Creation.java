package Ex_14_Strings;

public class Lab133_String_Creation {
    public static void main(String[] args){
        String s1 = "yash";  //  at String Constant Pool (SCP)
        String s2 = new String("YASH");  //  at Object Area (OA)
        System.out.println(s1);
        System.out.println(s2);
    }
}
