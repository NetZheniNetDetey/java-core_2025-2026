package lr4;

public class Example4 {
    static void main(String[] args) {
        int size = 5; // размер треугольника

        // Создаем двумерный массив
        int[][] triangle = new int[size][];

        // Заполняем массив: каждая строка имеет длину равную номеру строки + 1
        for (int i = 0; i < size; i++) {
            triangle[i] = new int[i + 1]; // создаем массив нужной длины для каждой строки
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = 1; // заполняем единицами
            }
        }

        // Выводим треугольник на экран
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
