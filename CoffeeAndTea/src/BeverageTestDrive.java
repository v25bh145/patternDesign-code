import caffeineBeverage.CoffeeWithHook;
import caffeineBeverage.TeaWithHook;

public class BeverageTestDrive {
    public static void main(String[] args) {

        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("Making tea...");
        teaWithHook.prepareRecipe();

        System.out.println("Making coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
