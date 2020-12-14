import duck.Duck;
import turkey.Turkey;

//第一版适配器
//对象适配器
//"如果它走起路来像只鸭子，叫起来像只鸭子，那么它可能是一只包装了鸭子适配器的火鸡"
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quark() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
