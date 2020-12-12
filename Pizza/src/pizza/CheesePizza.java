package pizza;

import ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    //覆盖方法
    public void prepare() {
        System.out.println("Preparing " + name);

        //缺什么原料就问抽象工厂类型要，委托给具体的工厂制造
        //Pizza与区域原料之间被解耦
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
    //自己有个问题:地区工厂之间的差别不止有原料，还有Chicago独特的cut()风格，这一点需要怎么实现？
}
