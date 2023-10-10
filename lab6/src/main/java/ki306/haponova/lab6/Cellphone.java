package ki306.haponova.lab6;

/**
 * The Cellphone class represents a cellphone product that implements the Product interface.
 *
 * @author Haponova Darina
 */
public class Cellphone implements Product{
    private String name;
    private int price;
    private boolean isDefect;

    /**
     * Constructs a Cellphone object with a given name, price, and defect status.
     *
     * @param name     The name of the cellphone.
     * @param price    The price of the cellphone.
     * @param isDefect True if the cellphone has defects; otherwise, false.
     */
    public Cellphone(String name, int price, boolean isDefect) {
        this.name = name;
        this.price = price;
        this.isDefect = isDefect;
    }

    /**
     * Compares this cellphone's price to another product's price.
     *
     * @param product The product to compare to.
     * @return A negative integer, zero, or a positive integer if this product's price is less than, equal to, or greater than the other product's price.
     */
    public int compareTo(Product product) {
        Integer p = price;
        return p.compareTo(product.getPrice());
    }

    /**
     * Gets the price of the cellphone.
     *
     * @return The price of the cellphone.
     */
    @Override
    public int getPrice() {
        return price;
    }

    /**
     * Checks if the cellphone has defects and prints a corresponding message.
     */
    @Override
    public void checkIfIsDefect() {
        if (isDefect) System.out.println("Cellphone " + name + " has a defect");
        else System.out.println("Cellphone " + name + " has no defects");
    }

    /**
     * Prints detailed information about the cellphone.
     */
    @Override
    public void print() {
        System.out.println("Cellphone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isDefect=" + isDefect +
                '}');
    }
}
