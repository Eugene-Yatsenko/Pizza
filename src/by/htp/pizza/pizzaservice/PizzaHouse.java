package by.htp.pizza.pizzaservice;

import java.util.Scanner;
import by.htp.pizza.pizzaservice.Pizza;
import java.util.concurrent.TimeUnit;

public class PizzaHouse {
	
	public Pizza askForPizza() {
		
		Pizza pizza = new Pizza();
		
		
		//Getting title and size
		
		System.out.println("Input pizza title");
		Scanner in = new Scanner(System.in);
		pizza.title = in.nextLine();
		
		System.out.println("Input pizza size");
		in = new Scanner(System.in);
		pizza.size = in.nextInt();
		
		//Getting delivery address
		
		System.out.println("Input delivery address");
		System.out.println("Input street name");
		in = new Scanner(System.in);
		pizza.sName = in.nextLine();
		
		System.out.println("Input house number");
		in = new Scanner(System.in);
		pizza.hNumber = in.nextInt();
		
		System.out.println("Input room number");
		in = new Scanner(System.in);
		pizza.room = in.nextInt();
		
		return pizza;
	}
	
	public void cookPizza(Pizza pizza){
		
		System.out.println("Cooking " + pizza.title + " pizza" + " of " + pizza.size + " size");
		
		System.out.println("Creating pizza stub of " + pizza.size + " size");
		pizza.pizzaStub = pizza.size;
		
		System.out.println("Adding following ingridients:");
		
		switch (pizza.title) {
		
		case "Italy":
			pizza.pizzaSauce = 1;
			System.out.println("-  pizza sauce");
			
			pizza.salami = (int)100*pizza.size/42;
			System.out.println("- " + pizza.salami + " grams of salami");
			
			pizza.tomatoes = (int)50*pizza.size/42;
			System.out.println("- " + pizza.tomatoes + " grams of tomatoes");
			break;
			
		case "Mexico":
			pizza.salami = (int)150*pizza.size/42;
			System.out.println("- " + pizza.salami + " grams of salami");
			
			pizza.spices = 1;
			System.out.println("- spices");
			break;
			
		case "Margarita":
			pizza.pizzaSauce = 1;
			System.out.println("- pizza sauce");
			break;

		}
		
		System.out.println("Pizza is ready!");
	}
	
	public void deliverPizza(Pizza pizza){
		
		System.out.println("Delivering pizza at " + pizza.sName + " " + pizza.hNumber + ", " + pizza.room);

	}

}
