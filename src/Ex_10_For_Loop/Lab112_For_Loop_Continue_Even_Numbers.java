package Ex_10_For_Loop;

public class Lab112_For_Loop_Continue_Even_Numbers{
    public static void main(String[] args) {

    for (int i = 0; i <= 50; i++) {
        if (i % 2 == 0) {      // if (i % 2 != 0)   <---  // for even number replace with
            continue;
        }
        System.out.println("Odd -> " + i);
    }


}
}
