package HW2.Task2;

public class Main {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[5];
            double catchedRes1 = intArray[0] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
