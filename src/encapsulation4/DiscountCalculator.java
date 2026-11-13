package encapsulation4;

public class DiscountCalculator {
	
	public double calculateDiscount(Product product, double discountPercentage) {
		
		if(discountPercentage < 0 || discountPercentage > 100) {
			System.out.println("Invalid discount");
			return product.getPrice();
		}
		
		double discount = product.getPrice() * discountPercentage / 100;
		
		return product.getPrice() - discount;
	}

}
