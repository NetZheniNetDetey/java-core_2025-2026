package lr3;

import java.util.Scanner;

public class Example8 {
    static void main() {
        Scanner in = new Scanner(System.in);

        char[] consonants = new char[10];
        char currentChar = 'B';
        int index = 0;

        while (index < 10) {
            if (currentChar != 'A' && currentChar != 'E' && currentChar != 'I' &&
                    currentChar != 'O' && currentChar != 'U') {
                consonants[index] = currentChar;
                index++;
            }
            currentChar++;
        }

        // Выводим содержимое массива
        System.out.println("Содержимое массива согласных букв:");
        for (int i = 0; i < consonants.length; i++) {
            System.out.print(consonants[i] + " ");
        }
        System.out.println();

        in.close();
    }
}
