import duck.Duck;
import duck.MallardDuck;
import turkey.WildTurkey;

//测试程序
public class DuckTestDrive {
    private static void testDuck(Duck duck) {
        duck.quark();
        duck.fly();
    }
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        
        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The Duck says...");
        testDuck(mallardDuck);

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
}
