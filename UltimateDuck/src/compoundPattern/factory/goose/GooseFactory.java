package compoundPattern.factory.goose;

import compoundPattern.duck.IQuackable;
import compoundPattern.goose.DuckGooseAdapter;
import compoundPattern.goose.Goose;

public class GooseFactory extends AbstractGooseFactory {
    @Override
    public IQuackable createDuckGooseAdapter() {
        return new DuckGooseAdapter(new Goose());
    }

    @Override
    public Goose createGoose() {
        return new Goose();
    }
}
