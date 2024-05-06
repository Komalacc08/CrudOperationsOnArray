package OrderManagementSystem;

public class OMSApp {
	public static void main(String[] args) {
		System.out.println("................................");
		
		OrderCreation oc=new OrderCreation();
		Order o1=oc.CreateOrder("phone", 75000.00, "iphone");
		Order o2=oc.CreateOrder("laptop", 65000.00, "HP");
		Order o3=oc.CreateOrder("phone", 45000.00, "oneplus");
		Order o4=oc.CreateOrder("laptop", 80000.00, "dell");
		Order o5=oc.CreateOrder("laptop", 80000.00, "dell");
		 
		//creating Order database of capacity 10
		        OrderDB oDB = new OrderDB(10);
				//storing Order in database
				oDB.addOrder(o1);
				oDB.addOrder(o2);
				oDB.addOrder(o3);
				oDB.addOrder(o4);
				oDB.addOrder(o5);
				
				
				System.out.println("................................");
				System.out.println("Total Order :"+oDB.getOrderCount());
				oDB.viewFullDatabase();
				System.out.println();
				
				Order o = oDB.searchOrder(1005);
				System.out.println(o.getOrderno()+""+o.getName());
				oDB.updatePrice(1003, 5000.00);
				oDB.viewFullDatabase();
				oDB.deleteOrder(1003);
				oDB.viewFullDatabase();
				System.out.println("Total Order"+oDB.getOrderCount());
				
				System.out.println("......................................");
			}
		}

				
				
		


