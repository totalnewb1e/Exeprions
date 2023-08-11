package HW3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Writer {
    public static void writeDataToFile(String lastName, String fullName, String birthDate, String phoneNumber, String gender) {
        String fileName = lastName + ".txt";
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            writer.write(String.format("%s, %s, %s, %s", fullName, birthDate, phoneNumber, gender));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("File write error.");
        }
    }
}
