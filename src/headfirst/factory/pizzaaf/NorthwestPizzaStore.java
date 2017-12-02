package headfirst.factory.pizzaaf;


public class NorthwestPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NorthwestIngredientFactory();
		
		pizza = new NorthwestPizza(ingredientFactory);
		pizza.setName("Northwest Style Pizza");

		return pizza;
	}

}
