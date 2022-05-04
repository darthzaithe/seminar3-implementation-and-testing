package se.kth.iv1350.pos.startup;

import se.kth.iv1350.pos.controller.Controller;
import se.kth.iv1350.pos.integration.DiscountDatabase;
import se.kth.iv1350.pos.integration.ExternalAccounting;
import se.kth.iv1350.pos.integration.ExternalInventory;
import se.kth.iv1350.pos.integration.Printer;
import se.kth.iv1350.pos.view.View;

/**
 * Main class handles the startup of the application.
 */

public class Main {

    /**
     * Standard main function that starts the application.
     *
     * @param args This application takes no command line arguments.
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        View view = new View(controller);
        Printer printer = new Printer();
        ExternalAccounting externalAccounting = new ExternalAccounting();
        ExternalInventory externalInventory = new ExternalInventory();
        DiscountDatabase discountDatabase = new DiscountDatabase();

        view.executeSampleOperation();
    }
}
