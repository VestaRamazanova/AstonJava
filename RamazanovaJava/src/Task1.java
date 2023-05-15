import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String number = scanner.nextLine();

        try {
            if (Integer.parseInt(number) > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Введенное число <=7");
            }
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное значение");
        } finally {
            scanner.close();
        }
    }
}

