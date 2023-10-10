package ki306.haponova.lab6;

/**
 * The AudioPlayer class represents a audioPlayer product that implements the Product interface.
 *
 * @author Haponova Darina
 */
public class AudioPlayer implements Product{
    private String name;
    private int price;
    private boolean isDefect;

    /**
     * Constructs an AudioPlayer object with a given name, price, and defect status.
     *
     * @param name     The name of the audio player.
     * @param price    The price of the audio player.
     * @param isDefect True if the audio player has defects; otherwise, false.
     */
    public AudioPlayer(String name, int price, boolean isDefect) {
        this.name = name;
        this.price = price;
        this.isDefect = isDefect;
    }

    /**
     * Compares this audio player's price to another product's price.
     *
     * @param product The product to compare to.
     * @return A negative integer, zero, or a positive integer if this product's price is less than, equal to, or greater than the other product's price.
     */
    public int compareTo(Product product) {
        Integer p = price;
        return p.compareTo(product.getPrice());
    }

    /**
     * Gets the price of the audio player.
     *
     * @return The price of the audio player.
     */
    @Override
    public int getPrice() {
        return price;
    }

    /**
     * Checks if the audio player has defects and prints a corresponding message.
     */
    @Override
    public void checkIfIsDefect() {
        if (isDefect) System.out.println("AudioPlayer " + name + " has a defect");
        else System.out.println("AudioPlayer " + name + " has no defects");
    }

    /**
     * Prints detailed information about the audio player.
     */
    @Override
    public void print() {
        System.out.println("AudioPlayer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isDefect=" + isDefect +
                '}');
    }
}
