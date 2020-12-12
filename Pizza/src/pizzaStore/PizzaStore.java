package pizzaStore;

import pizza.Pizza;

//创建者类
public abstract class PizzaStore {
    //工厂方法
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        //这里实现了解耦，将pizza的具体create方法[委托]给了子类的具体实现
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();
        pizza.box();

        return pizza;
    }
}
