package lesson04.arithmetic;

public class ArithmeticOps {

    public static int arithmetic() {
        int[] numbers = {3, 7, 2, 9, 4};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void print(int sum) {
        System.out.println("Сумма элементов: " + sum);
    }
}
