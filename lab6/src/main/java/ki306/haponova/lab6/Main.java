package ki306.haponova.lab6;

/**
 * Class Main demonstrates generics work
 *
 * @author Haponova Darina
 */
public class Main {
    /**
     * Method driver
     * @param args
     */
    public static void main(String[] args) {
        Conveyor <? super Product> conveyor = new Conveyor<>();
        conveyor.putProduct(new Cellphone("Cellphone number 1", 200, true));
        conveyor.putProduct(new AudioPlayer("mp3 player dragon red" , 130, false));
        conveyor.putProduct(new Cellphone("Cellphone3000" , 999, false));
        conveyor.putProduct(new AudioPlayer("King wave cosmos" , 300, false));

        Product product = conveyor.getProduct(0);
        product.print();

        product = conveyor.getProduct(2);
        product.checkIfIsDefect();
        conveyor.checkIfProductIsDefect(2);

        Product min = conveyor.getMin();
        System.out.println("\nThe cheapest product on the conveyor is: ");
        min.print();
    }
}