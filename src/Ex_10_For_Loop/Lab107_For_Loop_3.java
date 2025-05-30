package Ex_10_For_Loop;

public class Lab107_For_Loop_3 {
    //Can we do decrement in For Loop? YES you can

    public static void main(String[] args) {
        for (int i = -1; i > -10 ; i--) {
            System.out.println(i);
        }
        // Can we have INITIALIZATION(I) OUTSIDE FOR LOOP? YES
        int i = 10;
        for (; i > 0; i--) {
            System.out.println(i);
        }
    }
}
