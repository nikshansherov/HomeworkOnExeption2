public class Task2 {
    public static void main(String[] args) {
//        int[] intArray = {1, 2, 3, 4};
        int[] intArray = null;
        try {
            int d = 2;
            double catchedRes1 = intArray[7] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
