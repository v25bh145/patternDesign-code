package pizzaStore;

import ingredient.NYPizzaIngredientFactory;
import ingredient.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type) {
        /*
        if(type.equals("cheese")) {
            return new NYStoreCheesePizza();
        } else if(type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if(type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
         */
        if(type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }/* else if("...") {
            pizza = new XXXPizza(ingredientFactory);
            pizza.setName("xxx");
        }
        */
        return pizza;
    }
}
