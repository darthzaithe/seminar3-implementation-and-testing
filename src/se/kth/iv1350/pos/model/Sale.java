package se.kth.iv1350.pos.model;

import java.util.ArrayList;

/**
 * Handles the logic of a sale.
 */

public class Sale {
    private double currentTotal;
    private ArrayList<Item> itemList;


    /**
     * Registers one or more items. If an item has already been added the quantity is instead updated.
     * @param itemID The itemID number (format:xxxx)
     * @param quantity The number of items to be registered
     */
    public void registerItem(int itemID, int quantity){

    }

    public void pay(Payment payment){

    }

}
