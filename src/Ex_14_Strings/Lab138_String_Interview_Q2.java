package Ex_14_Strings;

public class Lab138_String_Interview_Q2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");


        // == -> Comparison -> String => this check the ref location i.e. String Constant Pool or Object Area
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5); // they are in same Object Area but are different
    }
}
