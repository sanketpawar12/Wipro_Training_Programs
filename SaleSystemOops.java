package OOPS_Programs;

public class SaleSystemOops {
    public static void main(String[] args) {
        SaleItem[] items = {
            new SaleItem("Laptop", 50000, 1),
            new SaleItem("Mouse", 500, 2),
            new SaleItem("KeyBoard", 700, 1),
        };

        double grandTotal = 0;

        System.out.println("Product\tPrice\tQty\tTotal");
        System.out.println("--------------------------------");

        for (SaleItem item : items) {
            item.displayItem();
            grandTotal += item.getTotalPrice();
        }

        System.out.println("--------------------------------");
        System.out.println("Grand Total: ₹" + grandTotal);
    }
}
