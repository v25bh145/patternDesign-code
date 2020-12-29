package compoundPattern.duck;

import compoundPattern.observer.IObservable;

public interface IQuackable extends IObservable {
    public void quack();
}
