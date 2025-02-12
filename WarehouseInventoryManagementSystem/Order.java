package WarehouseInventoryManagementSystem;

import java.util.*;
//import java.util.PriorityQueue;

public class Order extends Product {
	private static String orderID;
	private List<String> productIDs=new ArrayList<String>();
	private Priority priority;

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public List<String> getProductIDs() {
		return productIDs;
	}

	public void setProductIDs(List<String> productIDs) {
		this.productIDs = productIDs;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	Order() {
		productIDs.add(getProductId());
	}

//	Order(List productIDs) {
//		productIDs.add(getProductId());
//	}

}
