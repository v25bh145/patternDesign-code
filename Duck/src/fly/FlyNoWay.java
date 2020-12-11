package fly;

//实现了抽象行为接口的行为类
public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
