package se.kth.iv1350.pos.view;

import se.kth.iv1350.pos.controller.Controller;

/**
 * A simplified stand-in for a view.
 */
public class View {
    private Controller controller;

    /**
     * Creates new instance of View
     *
     * @param controller The controller
     */
    public View(Controller controller) {
        this.controller = controller;
    }

    public void executeSampleOperation(){
        controller.newSale();
    }
}
