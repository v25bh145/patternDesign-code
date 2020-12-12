package beverage.condiment;

import beverage.Beverage;
import beverage.CondimentDecorator;

//具体装饰者类，继承自装饰者父类(抽象)
//whip: 奶油
public class Whip extends CondimentDecorator {
    //通用父类的引用，包装的对象
    //可以是[继承自通用父类的被装饰者类]，也可以是[装饰了被装饰者的具体装饰者类]
    Beverage beverage;

    //在构造函数中写入要装饰的对象
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
}
