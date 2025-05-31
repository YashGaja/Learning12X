package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_StringBuilder {
    public static void main(String[] args) {
        StringBuilder s1= new StringBuilder("Hello");
        s1.append("World");
        s1.reverse();
        System.out.println(s1);
    }
}
