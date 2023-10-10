package ki306.haponova.lab1;

import java.io.*;
import java.util.*;
/**
 * The Lab1 class implements an example program for laboratory work №1
 *
 * @author No Information
 * @version 1.0
 * @since version 1.0
 *
 */
public class lab1
{
    public static void main(String[] args){

        int size = inputSize();
        char symbol = inputFiller();
        char[][] juggedArr = generateJaggedArr(size, symbol);

        showJuggedArr(juggedArr);
        saveJuggedArrToFile(juggedArr);

    }

    public static int inputSize(){
        Scanner scanner = new Scanner(System.in);
        int size;

        while(true){
            try {
                System.out.print("Enter size of square matrix: ");
                size = scanner.nextInt();
                break;
            }
            catch (Exception e) {
                System.out.println(e.getMessage() + ". Please enter a number");
                scanner.next();
            }
        }
        return size;
    }
    public static char inputFiller(){
        Scanner scanner = new Scanner(System.in);
        char symbol;

        while(true){
            try {
                System.out.print("Enter character to fill matrix: ");
                String str = scanner.nextLine();

                if (str.isEmpty()){
                    continue;
                }
                symbol = str.charAt(0);
                break;
            }
            catch (Exception e) {
                System.out.println(e.getMessage() + ". Please enter a character");
                scanner.next();
            }
        }
        return symbol;
    }

    public static char[][] generateJaggedArr(int size, char symbol){
        char[][] jaggedArr = new char[size][];

        int endOfArrPointer = 0;
        int center = size / 2;

        for (int i = 0; i < center; i++) {
            endOfArrPointer++;
            jaggedArr[i] = new char[endOfArrPointer];
            Arrays.fill(jaggedArr[i], ' ');
        }

        for (int i = center; i < size; i++) {
            endOfArrPointer++;
            jaggedArr[i] = new char[endOfArrPointer];
            Arrays.fill(jaggedArr[i], ' ');

            for (int j = size - i - 1; j <= i; j++) {
                jaggedArr[i][j] = symbol;
            }
        }

//        char[] bufferArr0 = jaggedArr[0];
//        jaggedArr[0] = jaggedArr[jaggedArr.length - 1];
//
//        char[] bufferArr1 = jaggedArr[1];
//        jaggedArr[1] = jaggedArr[jaggedArr.length - 2];
//
//        jaggedArr[jaggedArr.length - 1] = bufferArr0;
//        jaggedArr[jaggedArr.length - 2] = bufferArr1;

        return jaggedArr;
    }

    public static void showJuggedArr(char[][] juggedArr) {
        for (char[] charArr : juggedArr) {
            for (char ch : charArr) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void saveJuggedArrToFile(char[][] juggedArr) {
        try {
            PrintWriter writer = new PrintWriter("lab1/MyFile.txt");

            for (char[] charArr : juggedArr) {
                for (char ch : charArr) {
                    writer.print(ch + " ");
                }
                writer.print("\n");
            }

            writer.flush();
            writer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}