package se.kth.iv1350.pos.integration;

import java.util.ArrayList;
import java.util.List;

/**
 * Simplified stand-in for an external inventory system.
 */
public class ExternalInventory {
    private List<ItemData> inventory = new ArrayList<>();

    /**
     * Constructor for ExternalInventory
     */
    public ExternalInventory() {
        createInventory();
    }

    private void createInventory(){
        inventory.add(new ItemData("Soba", "Japanese buckwheat noodles", 34.99, 0.12));
        inventory.add(new ItemData("Sake", "Japanese rice wine", 99.99, 0.25));
        inventory.add(new ItemData("Art of Sushi", "A Sushi cook book", 199.99, 0.06));
    }

    private static class ItemData {
        private String name;
        private String description;
        private double price;
        private double taxRate;

        private ItemData(String name, String description, double price, double taxRate) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.taxRate = taxRate;
        }
    }
}

