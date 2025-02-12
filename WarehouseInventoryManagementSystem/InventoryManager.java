package WarehouseInventoryManagementSystem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

public class InventoryManager extends Product {
	private Map<String, List> products;
	private Map<String, List> locations;
	private PriorityQueue<List> orderQueue;

	public InventoryManager() {
		products = new ConcurrentHashMap<>();
		orderQueue = new PriorityQueue<>();
		locations=new HashMap<>();
		

	}

	public synchronized void addProduct(Product product) {
//		products.put(product.getProductId(), product.getProductName());
		locations.put(product.getProductId(),
				Arrays.asList(product.getAisle(), product.getShelf(), product.getBinNumber()));
	}

	public void processOrders() {
		Order orders = new Order();
		for (String id : orders.getProductIDs()) {
			orderQueue.add(handleStockLevels(id));
		}
		System.out.println(orderQueue);
	}

	public List handleStockLevels(String id) {
		if (locations.containsKey(id)){
			return locations.get(id);
		} else {
			return null;
		}

	}

}
