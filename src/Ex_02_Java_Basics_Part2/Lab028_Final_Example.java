package Ex_02_Java_Basics_Part2;

public class Lab028_Final_Example {
    public static void main(String[] args) {
        int local;
        local = 10;
        System.out.println(local);

        final float PI = 3.14f;
        // PI = 3.13f; This is final in nature it will print 3.14
        System.out.println(PI);
    }
}
