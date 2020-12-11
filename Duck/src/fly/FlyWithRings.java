package fly;

//实现了抽象行为接口的行为类
public class FlyWithRings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
