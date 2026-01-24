package lr2;

import java.util.Scanner;

public class Example4 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        double num = in.nextDouble();

        if ((num >= 5) && (num <= 10)){
            System.out.println("Число входит в диапазон от 5 до 10.");
        } else {
            System.out.println("Число не входит в диапазон от 5 до 10.");
        }
        in.close();
    }
}
