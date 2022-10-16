package Entities;

public class Course extends BaseEntity {

	private int unitPrice;

	
	
	
	
	public Course(int id, String name, int unitPrice) {
		super(id, name);
		this.unitPrice = unitPrice;
	}
	
	

	public Course() {
		
	}



	public Course(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}



	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
