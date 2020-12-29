package compoundPattern.factory.goose;

import compoundPattern.duck.IQuackable;
import compoundPattern.goose.Goose;

public abstract class AbstractGooseFactory {
    public abstract IQuackable createDuckGooseAdapter();
    public abstract Goose createGoose();
}
