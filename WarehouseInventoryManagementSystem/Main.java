package WarehouseInventoryManagementSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	InventoryManager inventoryManager = new InventoryManager();
	Product prod=new Product("101","Washngsoda",2,new Location(22,33,44));
	inventoryManager.addProduct(prod);
	inventoryManager.processOrders();
		

	}

}
