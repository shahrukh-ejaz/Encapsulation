package encapsulation4;

public class InventoryDriver {

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 50000, 10);

        Product p2 = new Product(102, "Mouse", 500, 20);

        InventoryService service = new InventoryService();

        DiscountCalculator discountCalculator = new DiscountCalculator();

        service.addProduct(p1);
        service.addProduct(p2);

        System.out.println("\n===== PRODUCT LIST =====");

        service.displayProducts();

        System.out.println("\n===== DISCOUNT =====");

        double finalPrice = discountCalculator.calculateDiscount(p1, 10);

        System.out.println("Laptop price after discount: " + finalPrice);

        System.out.println("\n===== PURCHASE =====");

        service.purchaseProduct(p1, 2);

        service.purchaseProduct(p2, 30);

        System.out.println("\n===== UPDATED INVENTORY =====");

        service.displayProducts();
    }
}