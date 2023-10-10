package ki306.haponova.lab3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The {@code Cat} abstract class represents a cat with various attributes and behaviors.
 * It can log the cat's actions to a text file.
 *
 * @author Haponova Darina
 */
public abstract class Cat {
    private String name;
    private int age;
    private String breed;
    private String logFileName;
    private FileWriter logFileWriter;

    /**
     * Constructs a new cat with default values and initializes a log file.
     */
    public Cat() {
        this.name = "";
        this.age = 0;
        this.breed = "";
        logFileName = "lab3/catLog.txt";

        try {
            logFileWriter = new FileWriter(new File(logFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Constructs a new cat with the specified name, age, and breed, and initializes a log file.
     *
     * @param name  The name of the cat.
     * @param age   The age of the cat.
     * @param breed The breed of the cat.
     */
    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        logFileName = "lab3/catLog.txt";

        try {
            logFileWriter = new FileWriter(new File(logFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the name of the cat.
     *
     * @param name The name of the cat.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the age of the cat.
     *
     * @param age The age of the cat.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the breed of the cat.
     *
     * @param breed The breed of the cat.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Gets the name of the cat.
     *
     * @return The name of the cat.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of the cat.
     *
     * @return The age of the cat.
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the breed of the cat.
     *
     * @return The breed of the cat.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Makes the cat meow and logs the action.
     */
    public void meow() {
        log(name + " says: Meow!");
    }

    /**
     * Makes the cat run and logs the action.
     */
    public void run() {
        log(name + " is running.");
    }

    /**
     * Makes the cat jump and logs the action.
     */
    public void jump() {
        log(name + " jumped.");
    }

    /**
     * Makes the cat purr and logs the action.
     */
    public void purr() {
        log(name + " is purring.");
    }

    /**
     * Makes the cat sleep and logs the action.
     */
    public void sleep() {
        log(name + " is sleeping.");
    }

    /**
     * Makes the cat eat the specified food and logs the action.
     *
     * @param food The food that the cat is eating.
     */
    public void eat(String food) {
        log(name + " is eating " + food + ".");
    }

    /**
     * Makes the cat play with the specified toy and logs the action.
     *
     * @param toy The toy that the cat is playing with.
     */
    public void play(String toy) {
        log(name + " is playing with " + toy + ".");
    }

    /**
     * Logs a message to the cat's log file.
     *
     * @param message The message to log.
     */
    public void log(String message) {
        try {
            logFileWriter.write(message + "\n");
            logFileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Closes the cat's log file.
     *
     * @throws IOException If an I/O error occurs while closing the log file.
     */
    public void dispose() throws IOException {
        logFileWriter.close();
    }
}