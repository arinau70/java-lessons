package lesson03;

public class temperature {
    public static void main(String[] args) {
        int x = -1;
        int y = 1;
        boolean isInsade;
        if (x >= -1 && x <= 1 && y >= -1 && y <= 1) {
            isInsade = true;
        } else {
            isInsade = false;
        }
        System.out.println("x = " + x + "," + " y = " + y);
        System.out.println("Точка внутри квадрата: " + isInsade);
    }
}
