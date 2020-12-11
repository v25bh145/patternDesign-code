package quack;

//实现了抽象行为接口的行为类
public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack.Squeak");
    }
}
