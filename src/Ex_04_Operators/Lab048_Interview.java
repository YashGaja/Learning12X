package Ex_04_Operators;

public class Lab048_Interview {
    public static void main(String[] args) {
        int balaji_salary = 20000;
        boolean b = !(balaji_salary  >10000 || balaji_salary < 5000);
        System.out.println(b);

        // A--  balaji_salary > 10000  --> 20000 > 10000 --- True
        // B--  balji_salary < 5000  --> 20000 < 5000 --- False
        // !(A || B) -> !(True || False) --> False
    }
}
