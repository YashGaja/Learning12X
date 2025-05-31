package Ex_15_StringBuffer_Builder_StringFunctions;

public class Lab146_StringBuffer {
    public static void main(String[] args) {

        StringBuffer s1= new StringBuffer("Java");
        s1 .append(" Programming");
        s1 .delete(5,16);    //will delete 5,16 i.e. Programming
        System.out.println(s1);

        s1 .replace(0,4,"C++");   // will replace Java with C++
        System.out.println(s1);
    }
}
