package beverage.coffee;

import beverage.Beverage;

//被装饰类，继承自通用父类
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return .89;
    }

}
