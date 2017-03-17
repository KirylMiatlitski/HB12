package by.epam.cousre.basic.task;

import java.util.ArrayList;

public class CookingCombine extends Combine{
	
	private int speed = 0;
	public Dish dish;
	public CookingCombine() {
		modifications = new ArrayList<>();
		dish = new Dish(CookingCombine.License.size);
	}
	@Override
	public void start(int speed) {
		this.speed = speed;	
		ArrayList<Food> result = new ArrayList<>();
		int size=0;
		
		for (int i = 0; i < dish.content.size(); i++){
			size = size + dish.content.get(i).getSize();
		}
		result.add(new Food("Ñìåñü", size));
		dish.content = result;
	}

	@Override
	public void stop() {
		this.speed = 0;		
	}
	
	public CookingCombine.Dish getDish(){
		return dish;
	}
	
	class Engine{
		public String power;
		public Engine() {
			this.power = CookingCombine.License.power;
		}
	}
	
	 public class Dish{
		private int size;		
		private ArrayList<Food> content;
		public Dish(int size) {
			this.size = size;
			this.content = new ArrayList<>();
		}		
		public void putIntoDish(Food food){
			content.add(food);
		}	
		public ArrayList<Food> getFromDish(){
			
			return dish.content;
		}
		@Override
		public String toString() {
			String result = "";
			result = result + "Size: "+ size + "\n";
			result = result + "Dish has: \n";
			for (int i = 0; i < content.size(); i++){
				result = result + content.get(i) + "\n";
			}		
			return  result;
		}
	}
	
	public static class License{
		static String  annotation = "Best Cooking Combine EVER";
		static String  status = "Ñertified";
		static int size = 2000;
		static String power = "600W";
		public static void changeStatus(String status){
			License.status = status;
		}
		
	}
	
	public void showCombine(){
		System.out.println("Combine info");
		System.out.println("Speed: " + speed);
		System.out.println("Dish: " + dish);
		System.out.println("Status: " + status);

		System.out.println("List of available modifications: " );
		String result = "";
		
		
		for (int i = 0; i < modifications.size(); i++){
			result = result +  modifications.get(i) + "\n";
		}		
		System.out.println(result);
		System.out.println("License status: "+ CookingCombine.License.status );
	}
}
