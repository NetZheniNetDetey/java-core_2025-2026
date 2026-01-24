package lr3;

import java.util.Scanner;

public class Example5 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("ВЕРСИЯ С ЦИКЛОМ FOR");
        System.out.print("Введите количество чисел для проверки: ");
        int count = in.nextInt();

        int sum = 0;
        System.out.println("\nЧисла, удовлетворяющие условиям:");

        for (int i = 1; i <= count; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\n\nСумма чисел: " + sum);

        System.out.println("\n\nВЕРСИЯ С ЦИКЛОМ WHILE");
        System.out.print("Введите количество чисел для проверки: ");
        count = in.nextInt();

        sum = 0;
        int i = 1;
        System.out.println("\nЧисла, удовлетворяющие условиям:");

        while (i <= count) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
            }
            i++;
        }

        System.out.println("\n\nСумма чисел: " + sum);

        in.close();
    }
}
