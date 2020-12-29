package compoundPattern.factory.duck;

import compoundPattern.duck.IQuackable;

//抽象工厂模式，多个接口与抽象工厂
public abstract class AbstractDuckFactory {

    public abstract IQuackable createMallardDuck();
    public abstract IQuackable createRedheadDuck();
    public abstract IQuackable createDuckCall();
    public abstract IQuackable createRobberDuck();
}
