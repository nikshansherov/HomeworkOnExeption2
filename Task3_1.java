public class Task3_1 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2, 3};
//            int[] abc = null;
            System.out.println(abc[2]);
        } catch (ArithmeticException ex) {
            System.out.println("Делить на ноль нельзя!");
        } catch (NullPointerException ex) {
            System.out.println("Массив не может быть null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
