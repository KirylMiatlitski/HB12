package by.epam.cousre.basic.task;

public class Modification {
	private String name;
	private int ID;
	
	public Modification(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}

	public String getName() {
		return name;
	}
	
	public int getID() {
		return ID;
	}
	
	@Override
	public String toString() {
		return "Modification: " + name + " with ID = "+ ID;  
	}
}
