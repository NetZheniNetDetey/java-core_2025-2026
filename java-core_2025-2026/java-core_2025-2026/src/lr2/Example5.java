package lr2;

import java.util.Scanner;

public class Example5 {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число:");
        long num = in.nextLong();
        num = Math.abs(num);
        int result = (int)((num / 1000) % 10);

        System.out.println("В числе " + result + " тысяч.");
        in.close();
    }
}
