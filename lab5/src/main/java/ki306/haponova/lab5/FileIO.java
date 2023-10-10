package ki306.haponova.lab5;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * Class FileIO is used to write/read data from txt/bin files
 * @author Haponova Darina
 */
public class FileIO {

    /**
     * Writes a double value to a text file.
     *
     * @param fName  The name of the file to write to.
     * @param result The double value to write to the file.
     */
    public void writeTxt(String fName, double result) {
        try {
            PrintWriter f = new PrintWriter(fName);
            f.print(result);
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception reason: Perhaps wrong file path " + e);
        }
    }

    /**
     * Reads a double value from a text file.
     *
     * @param fName The name of the file to read from.
     * @return The double value read from the file. Returns 0 if the file does not exist or does not contain a double value.
     */
    public double readTxt(String fName) {
        double result = 0;
        try {
            File file = new File(fName);
            Scanner scanner = new Scanner(file);
            scanner.useLocale(Locale.US);

            if (scanner.hasNextDouble()) {
                result = scanner.nextDouble();
                scanner.close();
            } else {
                System.err.println("The file does not contain a double value.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception reason: Perhaps wrong file path");
        }
        return result;
    }

    /**
     * Writes a double value to a binary file.
     *
     * @param fName  The name of the file to write to.
     * @param result The double value to write to the file.
     */
    public void writeBin(String fName, double result) {
        try {
            DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
            f.writeDouble(result);
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception reason: Perhaps wrong file path " + e);
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    /**
     * Reads a double value from a binary file.
     *
     * @param fName The name of the file to read from.
     * @return The double value read from the file. Returns 0 if the file does not exist or cannot be read.
     */
    public double readBin(String fName) {
        double result = 0;
        try {
            DataInputStream f = new DataInputStream(new FileInputStream(fName));
            result = f.readDouble();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception reason: Perhaps wrong file path " + e);
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        return result;
    }
}

