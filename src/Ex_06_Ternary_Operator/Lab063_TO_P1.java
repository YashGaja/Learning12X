package Ex_06_Ternary_Operator;

public class Lab063_TO_P1 {
    public static void main(String[] args) {
        int num = 5;
        String result = num > 0 ? "Positive" : "Negative";
       // int result = num > 0 ? "positive" : "negative";  ///ERROR
        System.out.println(result);
    }
}
