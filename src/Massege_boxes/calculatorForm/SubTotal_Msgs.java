package Massege_boxes.CalculatorForm;

public class SubTotal_Msgs {

    // Return the subtotal of the selected product
    public double subTotal(String qty, String unitPrice, String discount) {

        try {

            double quantity = Double.parseDouble(qty);
            double u_price = Double.parseDouble(unitPrice);
            double dis = Double.parseDouble(discount);
            return (u_price - dis) * quantity;

        } catch (NumberFormatException ex) {

            return 0;
        }
    }

    // Return the discount
    public double subDiscount(String qty, String discount) {

        try {
            double quantity = Double.parseDouble(qty);
            double dis = Double.parseDouble(discount);
            return (quantity * dis);

        } catch (NumberFormatException ex) {

            return 0;
        }

    }
}
