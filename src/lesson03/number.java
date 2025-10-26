package lesson03;

public class number {
    public static void main(String[] args) {
        int[] numbers = {-1, -10, 23, 44, 12, -5, 33, 156, 178, -1, 12, 9};
        System.out.println("Положительные чётные числа:");
        for (int number : numbers) {
            if (number % 2 == 0 && number > 0) {
                System.out.println(number);
            }
        }
    }
}
