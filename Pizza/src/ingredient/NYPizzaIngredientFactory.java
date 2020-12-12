package ingredient;

//具体工厂类
public class NYPizzaIngredientFactory extends PizzaIngredientFactory {

    public Ingredients.Dough createDough() {
        return new Ingredients.ThinCrustDough();
    }

    public Ingredients.Sauce createSauce() {
        return new Ingredients.MarinaraSauce();
    }

    public Ingredients.Cheese createCheese() {
        return new Ingredients.ReggianoCheese();
    }

    public Ingredients.Veggies[] createVeggies() {
        return new Ingredients.Veggies[]{
                new Ingredients.Garlic(),
                new Ingredients.Onion(),
                new Ingredients.Mushroom(),
                new Ingredients.RedPepper()
        };
    }

    public Ingredients.Pepperoni createPepperoni() {
        return new Ingredients.SlicedPepperoni();
    }

    public Ingredients.Clams createClams() {
        return new Ingredients.FreshClams();
    }

}
