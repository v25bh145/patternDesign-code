package compoundPattern;

import compoundPattern.composite.Flock;
import compoundPattern.decorator.QuackCounter;
import compoundPattern.duck.*;
import compoundPattern.factory.duck.AbstractDuckFactory;
import compoundPattern.factory.duck.CountingDuckFactory;
import compoundPattern.factory.goose.AbstractGooseFactory;
import compoundPattern.factory.goose.GooseFactory;
import compoundPattern.goose.DuckGooseAdapter;
import compoundPattern.goose.Goose;
import compoundPattern.observer.ChangeListener;

import java.beans.PropertyChangeListener;

//测试程序
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractGooseFactory gooseFactory = new GooseFactory();
        simulator.simulate(duckFactory, gooseFactory);
    }

    void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory) {
//        IQuackable mallardDuck = new MallardDuck();
//        IQuackable redheadDuck = new RedheadDuck();
//        IQuackable duckCall = new DuckCall();
//        IQuackable robberDuck = new RobberDuck();

//        IQuackable mallardDuck = new QuackCounter(new MallardDuck());
//        IQuackable redheadDuck = new QuackCounter(new RedheadDuck());
//        IQuackable duckCall = new QuackCounter(new DuckCall());
//        IQuackable robberDuck = new QuackCounter(new RobberDuck());
//        IQuackable goose = new DuckGooseAdapter(new Goose());

        IQuackable mallardDuck = duckFactory.createMallardDuck();
        IQuackable redheadDuck = duckFactory.createRedheadDuck();
        IQuackable duckCall = duckFactory.createDuckCall();
        IQuackable robberDuck = duckFactory.createRobberDuck();
        IQuackable goose = gooseFactory.createDuckGooseAdapter();

        //一群鸭子，包含所有鸭子
        Flock duckFlock = new Flock();

        //一群mallard鸭
        Flock mallardFlock = new Flock();
        //组合模式: 父亲节点包含叶子
        mallardFlock.add(duckFactory.createMallardDuck());
        mallardFlock.add(duckFactory.createMallardDuck());
        mallardFlock.add(duckFactory.createMallardDuck());
        mallardFlock.add(duckFactory.createMallardDuck());
        mallardFlock.add(duckFactory.createMallardDuck());

        //一群鹅
        Flock gooseFlock = new Flock();
        //组合模式: 父亲节点包含叶子
        gooseFlock.add(gooseFactory.createDuckGooseAdapter());
        gooseFlock.add(gooseFactory.createDuckGooseAdapter());

        //组合模式: 父亲节点包含叶子
        duckFlock.add(mallardDuck);
        //组合模式: 父亲节点包含父亲节点
        duckFlock.add(mallardFlock);
        duckFlock.add(gooseFlock);

        //观察者模式
        PropertyChangeListener changeListener = new ChangeListener();
        mallardDuck.registerObserver(changeListener);
        gooseFlock.registerObserver(changeListener);


        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(robberDuck);
        simulate(goose);

        System.out.println("The ducks quacked " + QuackCounter.getCount() + " times");

        System.out.println("\nDuck simulator: Whole Mallard Duck Flock Simulation");
        simulate(mallardFlock);

        System.out.println("\nDuck simulator: Whole Flock Simulation");
        simulate(duckFlock);
    }

    void simulate(IQuackable duck) {
        duck.quack();
    }
}
