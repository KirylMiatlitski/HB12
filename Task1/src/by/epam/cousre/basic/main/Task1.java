package by.epam.cousre.basic.main;

import by.epam.cousre.basic.task.CookingCombine;
import by.epam.cousre.basic.task.Food;
import by.epam.cousre.basic.task.Modification;

/**
 * @author Kiryl_Miatlitski
 * 
 * Date: 17 March 2017
 * 
 * Task: Напишите собственные примеры, показывающие особенности применения внутренних, вложенных и анонимных классов.
 */
public class Task1 {

	public static void main(String[] args) {
		
		System.out.println("Давайте купим кухонный комбайн");
		CookingCombine myCombine = new CookingCombine();
		//myCombine.showCombine();
		System.out.println("Добавим пару модификаций в комплектацию");
		myCombine.addModification(new Modification("Крюк для теста", 1));
		myCombine.addModification(new Modification("Венчик", 2));
		myCombine.showCombine();
		System.out.println("Устанавливаем венчик");
		myCombine.setModification(2);
		//myCombine.showCombine();
		System.out.println("Добавим ингредиентов в миску");
		myCombine.getDish().putIntoDish(new Food("Сметана", 1000));
		myCombine.getDish().putIntoDish(new Food("Сахар", 200));
		myCombine.showCombine();
		System.out.println("Включим комбайн");
		myCombine.start(3);
		//myCombine.showCombine();
		System.out.println("Выключаем");
		myCombine.stop();
		//myCombine.showCombine();
		System.out.println("Смотрим, что получилось");
		System.out.println(myCombine.getDish().getFromDish());
		
		Modification myModification = new Modification("Что-то новое", 3){
				int noizeLevel = 1000;
				@Override
				public String toString() {
					
					return super.toString() + " Noize level: "+ noizeLevel;
				}
		};
		myCombine.addModification(myModification);
		//myCombine.showCombine();
		CookingCombine.License.changeStatus("Дефект, производитель отзывает все комбайны");
		myCombine.showCombine();
		System.out.println("Покупаем другой кухонный комбайн");
		CookingCombine myCombine2 = new CookingCombine();
		myCombine2.showCombine();
		
	}

}
