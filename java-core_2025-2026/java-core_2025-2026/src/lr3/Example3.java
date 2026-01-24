package lr3;

import java.util.Scanner;

public class Example3 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int count = in.nextInt();

        int[] fibonacci = new int[count];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
        }

        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println(fibonacci[i]);
        }

//        int[] fibonacciWhile = new int[count];
//        fibonacciWhile[0] = 1;
//        fibonacciWhile[1] = 1;
//        int j = 2;
//
//        while (j < fibonacciWhile.length) {
//            fibonacciWhile[j] = fibonacciWhile[j - 2] + fibonacciWhile[j - 1];
//            j++;
//        }
//
//        for (int i = 0; i < fibonacci.length; i++) {
//            System.out.println(fibonacci[i]);
//        }

        in.close();
    }
}
