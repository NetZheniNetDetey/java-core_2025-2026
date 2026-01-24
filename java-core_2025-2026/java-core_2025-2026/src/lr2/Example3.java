package lr2;

import java.util.Scanner;

public class Example3 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        double num = in.nextDouble();

        if (((num % 4) == 0) && (num >= 10)){
            System.out.println("Число делится на 4, и при этом оно не меньше 10.");
        } else {
            System.out.println("Число не удовлетворяет условиям.");
        }
        in.close();
    }
}
