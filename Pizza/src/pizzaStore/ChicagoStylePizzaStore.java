package pizzaStore;

import ingredient.ChicagoPizzaIngredientFactory;
import ingredient.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    public Pizza createPizza(String type) {
        /*
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            default -> null;
        };
         */
        if(type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }/* else if("...") {
            pizza = new XXXPizza(ingredientFactory);
            pizza.setName("xxx");
        }
        */
        return pizza;
    }
}
