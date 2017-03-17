package by.epam.cousre.basic.main;

import by.epam.cousre.basic.task.CookingCombine;
import by.epam.cousre.basic.task.Food;
import by.epam.cousre.basic.task.Modification;

/**
 * @author Kiryl_Miatlitski
 * 
 * Date: 17 March 2017
 * 
 * Task: �������� ����������� �������, ������������ ����������� ���������� ����������, ��������� � ��������� �������.
 */
public class Task1 {

	public static void main(String[] args) {
		
		System.out.println("������� ����� �������� �������");
		CookingCombine myCombine = new CookingCombine();
		//myCombine.showCombine();
		System.out.println("������� ���� ����������� � ������������");
		myCombine.addModification(new Modification("���� ��� �����", 1));
		myCombine.addModification(new Modification("������", 2));
		myCombine.showCombine();
		System.out.println("������������� ������");
		myCombine.setModification(2);
		//myCombine.showCombine();
		System.out.println("������� ������������ � �����");
		myCombine.getDish().putIntoDish(new Food("�������", 1000));
		myCombine.getDish().putIntoDish(new Food("�����", 200));
		myCombine.showCombine();
		System.out.println("������� �������");
		myCombine.start(3);
		//myCombine.showCombine();
		System.out.println("���������");
		myCombine.stop();
		//myCombine.showCombine();
		System.out.println("�������, ��� ����������");
		System.out.println(myCombine.getDish().getFromDish());
		
		Modification myModification = new Modification("���-�� �����", 3){
				int noizeLevel = 1000;
				@Override
				public String toString() {
					
					return super.toString() + " Noize level: "+ noizeLevel;
				}
		};
		myCombine.addModification(myModification);
		//myCombine.showCombine();
		CookingCombine.License.changeStatus("������, ������������� �������� ��� ��������");
		myCombine.showCombine();
		System.out.println("�������� ������ �������� �������");
		CookingCombine myCombine2 = new CookingCombine();
		myCombine2.showCombine();
		
	}

}
