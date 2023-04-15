import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float number = numberImput();
        System.out.println("Введенное вами число: " + number);
    }

    public static float numberImput() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите число: ");
                float number = sc.nextFloat();
                sc.close();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Неподходящий тип данных!");
            }
        }
    }
}
