package ki306.haponova.lab6;

import java.util.ArrayList;

/**
 * The Conveyor class represents a conveyor belt for handling products of type T (must implement the Product interface).
 *
 * @param <T> The type of product the conveyor can handle.
 *
 * @author Haponova Darina
 */
public class Conveyor<T extends Product> {
    private ArrayList<T> arr;

    /**
     * Constructs a Conveyor object with an empty product list.
     */
    public Conveyor() {
        arr = new ArrayList<T>();
    }

    /**
     * Adds a product to the conveyor belt.
     *
     * @param product The product to add.
     */
    public void putProduct(T product) {
        arr.add(product);
        System.out.print("Product added: ");
        product.print();
    }

    /**
     * Retrieves a product from the conveyor belt by its index.
     *
     * @param i The index of the product to retrieve.
     * @return The product at the specified index.
     */
    public T getProduct(int i) {
        return arr.get(i);
    }

    /**
     * Finds and returns the product with the minimum price on the conveyor belt.
     *
     * @return The product with the minimum price, or null if the conveyor is empty.
     */
    public T getMin() {
        if (!arr.isEmpty()) {
            T min = arr.get(0);
            for (T product: arr) {
                if (product.compareTo(min) < 0) {
                    min = product;
                }
            }
            return min;
        }
        else return null;
    }

    /**
     * Checks if a product on the conveyor belt at the specified index has defects and prints a corresponding message.
     *
     * @param i The index of the product to check for defects.
     */
    public void checkIfProductIsDefect(int i) {
        arr.get(i).checkIfIsDefect();
    }
}
