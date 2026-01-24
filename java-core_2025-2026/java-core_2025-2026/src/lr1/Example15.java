package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a: ");
        float a = in.nextFloat();

        System.out.println("Input b: ");
        float b = in.nextFloat();

        float summ = a + b;
        float diff = a - b;

        System.out.println("a + b = " + summ + "\na - b = " + diff);
        in.close();
    }
}
