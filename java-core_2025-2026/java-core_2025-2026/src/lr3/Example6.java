package lr3;

import java.util.Scanner;
import java.util.Arrays;

public class Example6 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int size = 0;
        boolean validInput = false;

        // Ввод размера массива с обработкой ошибок
        while (!validInput) {
            try {
                System.out.print("Введите размер массива: ");
                String input = in.nextLine();
                size = Integer.parseInt(input);

                // Проверка на положительное число
                if (size <= 0) {
                    System.out.println("Ошибка: размер массива должен быть положительным числом!");
                    continue;
                }

                validInput = true;

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное целое число!");
            }
        }

        // Создание и заполнение массива
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            // Формула: числа с остатком 2 при делении на 5
            // это числа вида 5*i + 2: 2, 7, 12, 17, 22...
            array[i] = 5 * i + 2;
        }

        // Вывод результата
        System.out.println("\nСозданный массив:");
        System.out.println(Arrays.toString(array));

        in.close();
    }
}
