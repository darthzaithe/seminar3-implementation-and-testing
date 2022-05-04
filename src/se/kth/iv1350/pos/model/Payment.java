package se.kth.iv1350.pos.model;

/**
 * Represents a cash payment for a specific sale.
 */

public class Payment {
    private double amountPaid;

    /**
     * Creates a new instance.
     *
     * @param amountPaid The amount of cash given py the customer.
     */
    public Payment(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    double getChange(double totalCost){
        return amountPaid - totalCost;
    }
}
