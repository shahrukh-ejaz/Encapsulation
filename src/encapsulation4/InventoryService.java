package encapsulation4;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully!");
    }

    public void displayProducts() {

        for (Product product : products) {

            System.out.println("ID: " + product.getProducrId());
            System.out.println("Name: " + product.getProductName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Stock: " + product.getStock());
            System.out.println("--------------------");
        }
    }

    public void purchaseProduct(Product product, int quantity) {

        if (quantity > 0 && quantity <= product.getStock()) {

            product.setStock(product.getStock() - quantity);

            System.out.println("Purchase successful!");

        } else {
            System.out.println("Insufficient stock or invalid quantity!");
        }
    }
}