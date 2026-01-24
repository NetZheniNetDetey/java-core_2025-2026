package lr4;

public class Example3 {
    static void main(String[] args) {
        int rows = 5;    // количество строк
        int cols = 8;    // количество столбцов

        // Создаем двумерный массив
        int[][] rectangle = new int[rows][cols];

        // Заполняем массив цифрой 2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rectangle[i][j] = 2;
            }
        }

        // Выводим массив на экран
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
