package ki306.haponova.lab5;

import java.util.Scanner;

/**
 * Class EquationsApp Implements driver for Equations class
 * @author Haponova Darina
 */
public class EquationsApp {
    /**
     * Method driver
     * @param args
     */
    public static void main(String[] args) {
        Equation equation = new Equation();
        FileIO fileIO = new FileIO();
        double result;
        double fileResult;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        try {
            int x = scanner.nextInt();
            result = equation.calculate(x);
            System.out.println("Result is " + result);

            fileIO.writeTxt("lab5/textResult.txt", result);
            fileIO.writeBin("lab5/binResult.bin", result);

            fileResult = fileIO.readBin("lab5/binResult.bin");
            System.out.println("Result from binary file is: " + fileResult);

            fileResult = fileIO.readTxt("lab5/textResult.txt");
            System.out.println("Result from txt file is: " + fileResult);
        }
        catch (CalcException e) {
            System.out.println(e.getMessage());
        }
    }
}