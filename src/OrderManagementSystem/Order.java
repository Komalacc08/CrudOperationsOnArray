package OrderManagementSystem;

public class Order {
	private final int orderno;
	private String name;
	private double price;
	private String brandname;
	public Order(int orderno, String name, double price, String brandname) {
		this.orderno = orderno;
		this.name = name;
		this.price = price;
		this.brandname = brandname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getOrderno() {
		return orderno;
	}
	
	
	
	

}
