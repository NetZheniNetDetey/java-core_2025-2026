package lr3;

import java.util.Arrays;
import java.util.Random;

public class Example10 {
    static void main() {
        int size = 10;
        int[] array = new int[size];

        // Заполнение массива случайными числами
        Random random = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Вывод отсортированного массива
        System.out.println("\nОтсортированный массив (по убыванию):");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
