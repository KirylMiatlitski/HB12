package by.epam.cousre.basic.task;

import java.util.ArrayList;

public abstract class Combine  implements Functions{
	public String status = "off";
	public int currentMOdificationID = -1;
	public ArrayList<Modification> modifications;
	public Combine() {
	
	}
	
	public void addModification(Modification mod){
		this.modifications.add(mod);
	};
	public void setModification(int ID) {
		for (int i = 0; i < modifications.size() ; i++){
			if (modifications.get(i).getID() == ID){
				this.currentMOdificationID = ID;
				return;
			} 			
		}
		System.out.println("Что-то такой модификации нет");
	};
	public void removeModification(int mod){
		this.modifications.remove(mod);
	};
	
}
