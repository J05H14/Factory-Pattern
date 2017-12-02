package headfirst.factory.pizzaaf;

public class PizzaOrderSimulation {

	public static void main(String[] args) {
		PizzaStore nwStore = new NorthwestPizzaStore();
		
		Pizza nwPizza = nwStore.createPizza("");
		nwPizza.prepare();
		System.out.println("You Ordered a: " + nwPizza);

	}

}
