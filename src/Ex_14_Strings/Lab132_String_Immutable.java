package Ex_14_Strings;

public class Lab132_String_Immutable {
    public static void main(String[] args) {
        String name = "yash";  // Stored in String Constant Pool(SCP)
        name= name.toUpperCase();
        System.out.println(name);  //YASH
    }

}
