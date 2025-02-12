package WarehouseInventoryManagementSystem;

public class Location<T> {
	private int aisle;
	private int shelf;
	private int binNumber;

	Location(int aisle, int shelf, int binNumber) {
		this.aisle = aisle;
		this.shelf = shelf;
		this.binNumber = binNumber;
	}
	Location(){
		
	}

	public int getAisle() {
		return aisle;
	}

	public void setAisle(int aisle) {
		this.aisle = aisle;
	}

	public int getShelf() {
		return shelf;
	}

	public void setShelf(int shelf) {
		this.shelf = shelf;
	}

	public int getBinNumber() {
		return binNumber;
	}

	public void setBinNumber(int binNumber) {
		this.binNumber = binNumber;
	}

}
