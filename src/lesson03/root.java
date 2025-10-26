package lesson03;

public class root {
    public static void main(String[] args) {
        int a = 1, b = -3, c = 2;
        double d = b * b - 4 * a * c;
        System.out.println("Коэффициенты: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Дискриминант: " + d);
        if (d > 0) {
            double x1 = ((-b + Math.sqrt(d)) / (2 * a));
            double x2 = ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Корней нет.");
        }
    }
}
