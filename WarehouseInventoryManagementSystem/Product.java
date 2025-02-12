package WarehouseInventoryManagementSystem;

public class Product extends Location{
	private String productId;
	private String productName;
	private int productQty;
	private Location productLocation;
	private Location locate;

	Product(String productId, String productName, int productQty, Location productLocation) {
		this.productId = productId;
		this.productName = productName;
		this.productQty = productQty;
		this.locate=productLocation;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public Location getProductLocation() {
		return productLocation;
	}

	public void setProductLocation(Location productLocation) {
		this.productLocation = productLocation;
	}
	Product(){
		
	}

}
