package ducks;

import fly.IFlyBehavior;
import quack.IQuackBehavior;

//抽象类
public abstract class Duck {
    IFlyBehavior iFlyBehavior;
    IQuackBehavior iQuackBehavior;

    public Duck() {}
    public abstract void display();

    // 直接在抽象类调用抽象接口的方法，在子类中，会有行为类实现抽象接口的方法。
    // 在子类执行这个方法时就会调用实现该接口的行为类。
    public void performFly() {
        iFlyBehavior.fly();
    }

    public void performQuack() {
        iQuackBehavior.quack();
    }

    public void swim() {
        //decoy: 假鸭子
        System.out.println("All ducks float, even decoys!");
    }

    //在抽象类中可以直接创建行为的getter/setter，子类执行时就会被[委托]给一个行为类。
    public void setFlyBehavior(IFlyBehavior fb) {
        iFlyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        iQuackBehavior = qb;
    }
}
