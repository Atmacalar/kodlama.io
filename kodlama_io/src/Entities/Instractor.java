package Entities;

public class Instractor extends BaseEntity {

	private String surname;
	
	
	

	public Instractor(int id, String name, String surname) {
		super(id, name);
		this.surname = surname;
	}
	
	

	public Instractor() {
		
	}



	public Instractor(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}



	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
