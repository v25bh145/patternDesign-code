package beverage;

import beverage.coffee.DarkRoast;
import beverage.coffee.Espresso;
import beverage.condiment.Mocha;
import beverage.condiment.Soy;
import beverage.condiment.Whip;

//测试程序
public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        //添加装饰者进行类包装
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

    }
}
