package by.epam.cousre.basic.task;

public class Food {
	private String name;
	private int size;
	public Food(String name, int size) {
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	@Override
	public String toString() {
		
		return size+" "+name;
	}
}
