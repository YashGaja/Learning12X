package Tasks;

public class Task03 {
    public static void main(String[] args) {
        int i = 11;
        i = i++ + ++i;

        System.out.println(i); //24

        int a = 11;
        int b = 22;
        int c =  a + b + a++ + b++ + ++a + ++b; //103


        System.out.println("a=" + a); //13

        System.out.println("b=" + b); //24

        System.out.println("c=" + c); //103

        int x = 1;
        int y = 2;
        int z = 3;
        int m = x-- - y-- - z--;

        System.out.println("x=" + x + ", y=" + y + ", z=" + z + ", m=" + m);


    }
}
