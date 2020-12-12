package beverage.coffee;

import beverage.Beverage;

//被装饰类，继承自通用父类
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .95;
    }

}
