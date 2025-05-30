package Ex_10_For_Loop;

public class Lab111_For_Loop_Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 50 ; i++) {
            if(i ==5){     //it will skip 5 and continue
                continue;
            }
            System.out.println(i);
        }



    }
}
