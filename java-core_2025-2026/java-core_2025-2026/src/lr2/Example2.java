package lr2;

import java.util.Scanner;

public class Example2 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        double num = in.nextDouble();

        if (((num % 5) == 2) && ((num % 7) == 1)){
            System.out.println("При делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1");
        } else {
            System.out.println("Число не удовлетворяет условиям.");
        }

        in.close();
    }
}
