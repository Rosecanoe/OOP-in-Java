
// Create a class named Billing
// that includes three overloaded computeBill() methods for a photo book store.
//
// When computeBill() receives a single parameter, it represents the price of one photo book ordered.
//
// Add 8% tax, and return the total due.
//
// When computeBill() receives two parameters, they represent the price of a photo book and the quantity ordered.
// Multiply the two values, add 8% tax, and return the total due.
//
// When computeBill() receives three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value.
// Multiply the quantity and price, reduce the result by the coupon value, and then add 8% tax and return the total due.
// Write a main() method that tests all three overloaded methods.

// Save the application as Billing.java.

public class Billing {

//    the tax is fixed
    final double TAX = 0.08;

    public double computerBill(double price){
        double amount = price*(1+TAX);
        return amount;
    }

    public double computerBill(double price, int quality){
        double amount = price*quality*(1+TAX);
        return amount;
    }

    public double computerBill(double price, int quality, double coupon){
        double amount = (price*quality-coupon)*(1+TAX);
        return amount;
    }
}
