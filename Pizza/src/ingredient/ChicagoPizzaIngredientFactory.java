package ingredient;

//具体工厂类
//这里免于麻烦没有创建有关Chicago书中的具体原料类，直接cv NY的具体原料类
public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {

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
