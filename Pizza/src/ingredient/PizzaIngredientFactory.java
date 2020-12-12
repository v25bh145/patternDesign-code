package ingredient;

//抽象工厂基类
public abstract class PizzaIngredientFactory {


    public abstract Ingredients.Dough createDough();
    public abstract Ingredients.Sauce createSauce();
    public abstract Ingredients.Cheese createCheese();
    public abstract Ingredients.Veggies[] createVeggies();
    public abstract Ingredients.Pepperoni createPepperoni();
    public abstract Ingredients.Clams createClams();
}
