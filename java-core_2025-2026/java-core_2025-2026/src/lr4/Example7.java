package lr4;

public class Example7 {
    static void main(String[] args) {
        int size = 10; // размер массива (10x10 как на рисунке)
        int[][] array = new int[size][size];

        int counter = 1; // счетчик для заполнения
        int row = 0;
        int col = 0;

        // Заполняем массив змейкой
        while (counter <= size * size) {
            // 1. Заполняем строку слева направо
            while (col < size && array[row][col] == 0) {
                array[row][col] = counter++;
                col++;
            }
            col--; // возвращаемся на последний заполненный столбец
            row++; // переходим на следующую строку

            if (counter > size * size) break;

            // 2. Заполняем столбец сверху вниз
            while (row < size && array[row][col] == 0) {
                array[row][col] = counter++;
                row++;
            }
            row--; // возвращаемся на последнюю заполненную строку
            col--; // переходим на предыдущий столбец

            if (counter > size * size) break;

            // 3. Заполняем строку справа налево
            while (col >= 0 && array[row][col] == 0) {
                array[row][col] = counter++;
                col--;
            }
            col++; // возвращаемся на последний заполненный столбец
            row--; // переходим на предыдущую строку

            if (counter > size * size) break;

            // 4. Заполняем столбец снизу вверх
            while (row >= 0 && array[row][col] == 0) {
                array[row][col] = counter++;
                row--;
            }
            row++; // возвращаемся на последнюю заполненную строку
            col++; // переходим на следующий столбец
        }

        // Выводим массив
        System.out.println("Массив, заполненный змейкой:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}
