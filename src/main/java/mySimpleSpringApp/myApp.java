package mySimpleSpringApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import food.Meal;

public class myApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("myTestPackage/appContext.xml");
		
		Meal myNormalMeal = new Meal();
		System.out.println("Normal Meal : "+myNormalMeal.whatsInThisMeal() );
		
		Meal mySpringMeal = appContext.getBean("meal", Meal.class);
		System.out.println("MySpringMeal"+mySpringMeal.whatsInThisMeal());
		
		Meal mySpringMealWithAlt = appContext.getBean("mealWithAlt", Meal.class);
		System.out.println("MySpringMeal"+mySpringMealWithAlt.whatsInThisMeal());
		
		
		
		
		
		((ClassPathXmlApplicationContext) appContext).close();
		

	}

}
