package encapsulation4;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private int stock;
	
	
	public Product(int productid, String productName, double price, int stock) {
		this.productId = productId;
		this.productName = productName;
		setPrice(price);
		setStock(stock);
	}
	
	public int getProducrId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setPrice(double price) {
		if(price > 0) {
			this.price=price;
		}
		
	}
	public void setStock(int stock) {
		if(stock >- 0) {
			this.stock = stock;
		}
	}
	}

