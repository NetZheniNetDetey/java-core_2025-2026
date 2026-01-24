package lr4;

import java.util.Random;

public class Example5 {
    static void main(String[] args) {
        int rows = 3;    // количество строк исходного массива
        int cols = 5;    // количество столбцов исходного массива

        // Создаем исходный массив
        int[][] originalArray = new int[rows][cols];
        Random random = new Random();

        // Заполняем массив случайными числами от 0 до 99
        System.out.println("Исходный массив (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = random.nextInt(100);
                System.out.print(originalArray[i][j] + "\t");
            }
            System.out.println();
        }

        // Создаем транспонированный массив (меняем строки и столбцы)
        int[][] transposedArray = new int[cols][rows];

        // Транспонируем: элемент [i][j] становится элементом [j][i]
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = originalArray[i][j];
            }
        }

        // Выводим транспонированный массив
        System.out.println("\nТранспонированный массив (" + cols + "x" + rows + "):");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
