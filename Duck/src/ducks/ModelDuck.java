package ducks;

import fly.FlyNoWay;
import quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        iFlyBehavior = new FlyNoWay();
        iQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
