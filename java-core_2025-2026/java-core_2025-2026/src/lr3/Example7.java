package lr3;

import java.util.Scanner;

public class Example7 {
    static void main() {
        Scanner in = new Scanner(System.in);

        // Размер массива задается переменной
        int size = 10;

        // Создание одномерного символьного массива
        char[] array = new char[size];

        // Заполнение массива буквами "через одну", начиная с 'а'
        char currentChar = 'а';
        for (int i = 0; i < size; i++) {
            array[i] = currentChar;
            currentChar += 2; // Переход к букве через одну
        }

        // Вывод массива в прямом порядке
        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Вывод массива в обратном порядке
        System.out.println("\nМассив в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        in.close();
    }
}
