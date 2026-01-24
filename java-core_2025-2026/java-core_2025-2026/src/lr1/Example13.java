package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a: ");
        float a = in.nextFloat();

        System.out.println("Input b: ");
        float b = in.nextFloat();

        float result = a + b;

        System.out.println("Result: " + result);
        in.close();
    }
}
