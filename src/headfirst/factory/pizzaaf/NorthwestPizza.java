package headfirst.factory.pizzaaf;

public class NorthwestPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	 
	public NorthwestPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}

}
