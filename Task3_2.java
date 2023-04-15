import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        String str = stringImput();
        System.out.println("Введенная вами строка: " + str);
    }

    public static String stringImput() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите строку: ");
                String str = sc.nextLine();
                if (str.length() == 0) {
                    throw new InputStringException("Вы ничего не ввели, попробуйте еще раз!");
                }
                sc.close();
                return str;
            } catch (InputStringException e) {
                System.out.println(e);
            }
        }
    }
}

class InputStringException extends RuntimeException {
    public InputStringException(String message) {
        super(message);
    }
}
