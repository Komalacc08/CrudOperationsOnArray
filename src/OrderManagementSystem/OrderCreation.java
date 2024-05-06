package OrderManagementSystem;

public class OrderCreation {
	private static int randum=1001;
	public Order CreateOrder(String name,double price,String brandname) {
		Order o=new Order(randum++,name,price,brandname);
		return o;
	}

}
