package by.htp.pizza.runner;

import by.htp.pizza.pizzaservice.Pizza;
import by.htp.pizza.pizzaservice.PizzaHouse;

public class MainApp {

	public static void main(String[] args) {
		
       PizzaHouse house = new PizzaHouse();
       Pizza pizza = new Pizza();
       
       pizza = house.askForPizza();
       
       house.cookPizza(pizza);
       house.deliverPizza(pizza);
		
		//Ask for pizza
		
		// Cook pizza
		
		// Deliver pizza

	}

}
