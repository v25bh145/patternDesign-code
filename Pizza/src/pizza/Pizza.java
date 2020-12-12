package pizza;

import ingredient.Ingredients;

import java.util.ArrayList;

//产品基类
public abstract class Pizza {
    String name;
    Ingredients.Dough dough;
    Ingredients.Sauce sauce;
    Ingredients.Veggies[] veggies;
    Ingredients.Cheese cheese;
    Ingredients.Pepperoni pepperoni;
    Ingredients.Clams clams;

    //现在原料与子类创建者相关，需要挪到子类生产者中实现。
    public abstract void prepare(); /*{
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (Object topping : toppings) {
            System.out.println("   " + topping);
        }
    }*/
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //打印披萨
    public String toString() {
        return "qwq";
    }
}
