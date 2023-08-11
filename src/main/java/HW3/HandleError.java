package HW3;

public class HandleError extends Exception {
    public static void handleError(String message) {
        System.err.println("Ошибка: " + message);
    }
}
