package lr4;

import java.util.Random;

public class Example6 {
    static void main(String[] args) {
        int rows = 5;    // количество строк
        int cols = 6;    // количество столбцов

        // Создаем и инициализируем исходный массив
        int[][] originalArray = new int[rows][cols];
        Random random = new Random();

        System.out.println("Исходный массив (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = random.nextInt(100);
                System.out.print(originalArray[i][j] + "\t");
            }
            System.out.println();
        }

        // Генерируем случайные индексы для удаления
        int removeRow = random.nextInt(rows);
        int removeCol = random.nextInt(cols);

        System.out.println("\nУдаляем строку с индексом: " + removeRow);
        System.out.println("Удаляем столбец с индексом: " + removeCol);

        // Создаем новый массив меньшего размера
        int[][] newArray = new int[rows - 1][cols - 1];

        // Заполняем новый массив, пропуская удаляемую строку и столбец
        int newRow = 0;
        for (int i = 0; i < rows; i++) {
            if (i == removeRow) {
                continue; // пропускаем удаляемую строку
            }

            int newCol = 0;
            for (int j = 0; j < cols; j++) {
                if (j == removeCol) {
                    continue; // пропускаем удаляемый столбец
                }

                newArray[newRow][newCol] = originalArray[i][j];
                newCol++;
            }
            newRow++;
        }

        // Выводим новый массив
        System.out.println("\nНовый массив (" + (rows - 1) + "x" + (cols - 1) + "):");
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
