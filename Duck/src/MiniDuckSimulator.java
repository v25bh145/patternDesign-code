import ducks.Duck;
import ducks.MillardDuck;
import ducks.ModelDuck;
import fly.FlyRocketPowered;

//测试程序
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MillardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        model.performQuack();
    }
}
