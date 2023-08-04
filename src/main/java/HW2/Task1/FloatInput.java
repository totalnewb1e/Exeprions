package HW2.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**@apiNote
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class FloatInput {
    protected float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float floatValue;
        while (true) {
            try {
                floatValue = scanner.nextFloat();
                break;
            } catch (InputMismatchException exception) {
                System.out.println("This is not float number, please try again: ");
                scanner.next(); // clear invalid input
            }
        }
        return floatValue;
    }
}
