package Ex_10_For_Loop;

public class Lab110_For_Loop_Break {
    //Can we use break in FOR LOOP? yes you can
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
            // System.out.println(i);        // from 0 to 5
            if (i == 5) {
                break;
               //  System.out.println(i);   //  from 0 to 4
            }
            System.out.println(i);         //  from 0 to 4
        }
    }
}
