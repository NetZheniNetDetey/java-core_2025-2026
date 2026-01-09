package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        float number = in.nextFloat();

        float lessNum = number - 1;
        float greaterNum = number + 1;
        float squareNum = (float) Math.pow((lessNum + number + greaterNum), 2);

        System.out.println(lessNum + ", " + number + ", " + greaterNum + ", " + squareNum);
        in.close();
    }
}
