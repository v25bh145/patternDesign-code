package ducks;

import fly.FlyWithRings;
import quack.Quack;

public class MillardDuck extends Duck {

    public MillardDuck() {
        //在子类的构造函数中绑定(初始化)行为类
        iQuackBehavior = new Quack();
        iFlyBehavior = new FlyWithRings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real millard duck!");
    }
}
