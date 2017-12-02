package headfirst.factory.pizzaaf;

public class NorthwestIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new HawaiianStyleAlfredoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new GoudaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		return null;
	}

	@Override
	public Pepperoni createPepperoni() {
		return null;
	}

	@Override
	public Clams createClam() {
		return new MahiMahi();
	}

}
