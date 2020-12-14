package duck;

public class MallardDuck implements Duck {
    @Override
    public void quark() {
        System.out.println("Quark quark");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
