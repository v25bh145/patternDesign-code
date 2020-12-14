import duck.Duck;
import turkey.Turkey;

//双向适配器(自己写的)
//还可以写多对一适配器、多对多适配器等等，适配方向也不仅限于单向
public class TurkeyAndDuckAdapter implements Duck, Turkey {
    Duck duck;
    Turkey turkey;
    boolean isDuck;

    public TurkeyAndDuckAdapter(Duck duck) {
        this.duck = duck;
        isDuck = true;
    }
    public TurkeyAndDuckAdapter(Turkey turkey) {
        this.turkey = turkey;
        isDuck = false;
    }

    @Override
    public void quark() {
        if(!isDuck) return;
        duck.quark();
    }

    @Override
    public void gobble() {
        if(isDuck) return;
        turkey.gobble();
    }

    @Override
    public void fly() {
        if(isDuck) duck.fly();
        else turkey.fly();
    }
}
