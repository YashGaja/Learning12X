package Ex_08_If_Condition;

import org.jetbrains.annotations.NotNull;

public class Lab079_If {
    public static void main(@org.jetbrains.annotations.NotNull String @NotNull [] args) {

        int age = Integer.parseInt(args[0]);
        if(age > 18){
            System.out.println("You can vote!");
        }else{
            System.out.println("You can't vote!");
        }

    }
}
