package lr3;

import java.util.Scanner;

public class Example4 {
    static void version1_For(int a, int b) {
        System.out.println("\nВерсия 1 (цикл for):");
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void version2_While(int a, int b) {
        System.out.println("\nВерсия 2 (цикл while):");
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int i = min;
        while (i <= max) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = in.nextInt();

        System.out.println("\n=== Все версии программы ===");

        version1_For(num1, num2);
        version2_While(num1, num2);

        in.close();
    }
}
