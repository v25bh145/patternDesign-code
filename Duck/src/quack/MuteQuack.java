package quack;

//实现了抽象行为接口的行为类
public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
