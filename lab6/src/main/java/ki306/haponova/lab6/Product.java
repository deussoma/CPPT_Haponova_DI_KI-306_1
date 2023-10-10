package ki306.haponova.lab6;

/**
 * The Product interface represents a product with a price that can be compared and checked for defects.
 *
 * @author Haponova Darina
 */
public interface Product extends Comparable<Product> {
    /**
     * Gets the price of the product.
     *
     * @return The price of the product.
     */
    public int getPrice();

    /**
     * Checks if the product has any defects.
     */
    public void checkIfIsDefect();

    /**
     * Prints information about the product.
     */
    public void print();
}
