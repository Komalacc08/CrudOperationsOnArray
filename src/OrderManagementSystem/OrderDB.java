package OrderManagementSystem;

public class OrderDB {
	private Order[] ordarr;
	private int index=0;
	private int ordCount=0;
	
	 OrderDB(int size){
		ordarr = new Order[size];
	
}
	/**
	 * this method is used to add order details into the database.
	 * @param o should be order type
	 * @return returns true if added successfully,else returns false.
	 */
	public boolean addOrder(Order o)
	{
		if(index < ordarr.length) {
			ordarr[index++]=o;
			System.out.println("Order details added to the database Successfully");
			ordCount++;
			return true;
			
		}
		else {
			System.out.println("Database if full");
			return false;
		}
	}
	/**
	 * this method is used to get total order in the database
	 * @return index 
	 */
	public void viewFullDatabase() {
		System.out.println(".....................................................");
		System.out.println("OrderNmae\tName\tPrice\tBrand Name");
		System.out.println(".....................................................");
		
		for(Order ord : ordarr) {
			if(ord!=null) {
				System.out.println(ord.getOrderno()+"\t"+ord.getName()+"\t"+ord.getPrice()+"\t"+ord.getBrandname());
			}
		}
	}
	/**
	 * this method is used to get total order in the database
	 * @return index 
	 */
	public int getOrderCount() {
		return ordCount;
	}
	/**
	 * this method is used to search order based on id,
	 * @param id of the order to be searched
	 * @return return reference to found order otherwise returns null.
	 */
	public Order searchOrder(int orderno) {
		Order o=null;
		for(int i=0;i<ordarr.length;i++) {
			if(ordarr[i]!=null && ordarr[i].getOrderno()==orderno) {
				System.out.println("Order found in the databse");
				o = ordarr[i];
			}
		}
		if(o==null) {
			System.out.println("order is not found in database");
		}
		return o;
	}
	/**
	 * this method is used to update the price of the order. If order is found in
	 * the database it will update the price of the order by the specified amount.
	 * @param id - order id whose price has to be updated
	 * @return true  - if update is success
	 * 			false - if update is failed
	 */
	public boolean updatePrice(int orderno,double price) {
		Order o=searchOrder(orderno);
		if(o!=null) {
			double amount = 0;
			o.setPrice(o.getPrice()+amount);
			System.out.println("Price Updated");
			return true;
		}
		else {
			System.out.println("Unable to update,check Order no");
			return false;
		}
	}
	/**
	 * this method is used to delete order details from database
	 * it deletes the complete order details if the record is found in the database
	 * @param id of the order to be deleted
	 * @return true if deletion of order is successful otherwise it returns false
	 */
	public boolean deleteOrder(int orderno) {
		boolean isDeleted=false;
		for(int i=0;i<ordarr.length;i++) {
			if(ordarr[i]!=null && ordarr[i].getOrderno()==orderno) {
				System.out.println("Order found in the databse and deleted");
				
				ordarr[i]= null;
				isDeleted=true;
				ordCount--;
			}
		}
	
		if( isDeleted==false) {
			System.out.println("Order not found in database");
		}
		return isDeleted;
	}
}

