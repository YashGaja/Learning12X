package Ex_12_DoWhile;

public class Lab123_Diff_While_DowhILE {
    public static void main(String[] args) {

        int a = 0;
//        while (a < 0) {       //      won't print anything
//            System.out.println(a);
//            a++;
//        }

        do{
            System.out.println(a);      //will print 0
            a++;
        }while (a<0);


    }
}
