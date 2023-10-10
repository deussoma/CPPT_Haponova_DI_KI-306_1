package ki306.haponova.lab2;

import java.io.IOException;

/**
 * The {@code CatApplication} class is a simple program that demonstrates the usage
 * of the {@link Cat} class to create and interact with a cat object.
 *
 * @author Haponova Darina
 */
public class CatApplication {
    /**
     * The main entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Cat myCat = new Cat("Whiskers", 3, "Siamese");

        myCat.setName("Fluffy");
        System.out.println("Cat's name: " + myCat.getName());
        myCat.setAge(4);
        System.out.println("Cat's age: " + myCat.getAge());
        myCat.setBreed("Persian");
        System.out.println("Cat's breed: " + myCat.getBreed());

        myCat.meow();
        myCat.run();
        myCat.jump();
        myCat.purr();
        myCat.sleep();
        myCat.eat("tuna");
        myCat.play("a ball");

        try {
            myCat.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}