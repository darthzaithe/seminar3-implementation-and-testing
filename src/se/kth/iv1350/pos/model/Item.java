package se.kth.iv1350.pos.model;

/**
 * Represents an item in the store.
 */
public class Item {
    private String name;
    private String description;
    private double price;
    private double taxRate;

    /**
     * Creates a new reference.
     *
     * @param name The name of the item.
     * @param description A description of the item.
     * @param price The price of the item.
     * @param taxRate The VAT rate (format:0.xx) of the item.
     */
    public Item(String name, String description, double price, double taxRate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.taxRate = taxRate;
    }
}
