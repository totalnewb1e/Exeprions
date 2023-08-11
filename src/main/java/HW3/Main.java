package HW3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

import static HW3.HandleError.handleError;
import static HW3.Writer.writeDataToFile;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your personal data: ");
        String input = scanner.nextLine();

        String[] inputData = input.split("\\s");
        if (inputData.length != 6) {
            handleError("more data expected.");
            return;
        }

        String fullName = inputData[0] + " " + inputData[1] + " " + inputData[2];
        String birthDate = inputData[3];
        String phoneNumber = inputData[4];
        String gender = inputData[5];

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            dateFormat.setLenient(false);
            dateFormat.parse(birthDate);

            if (!Pattern.matches("\\d+", phoneNumber)) {
                throw new NumberFormatException("Invalid phone number format");
            }

            if (!gender.equals("f") && !gender.equals("m")) {
                throw new IllegalArgumentException("Invalid gender type");
            }

            writeDataToFile(inputData[0], fullName, birthDate, phoneNumber, gender);
            System.out.println("data saved successfully!");

        } catch (ParseException e) {
            handleError("Invalid date of birth format. Use dd.MM.yyyy format");
        } catch (NumberFormatException e) {
            handleError(e.getMessage());
        } catch (IllegalArgumentException e) {
            handleError(e.getMessage());
        }
    }
}

