package caffeineBeverage;

public abstract class CaffeineBeverage {
    //final，不想要子类继承
    //模板方法，算法的骨架
    public final void prepareRecipe() {
        boilTheWater();
        brew();
        pourInCup();
        //hook可以作为条件控制影响算法流程
        if(customerWantsCondiments())
            addCondiments();
    }

    //算法的逻辑实现的接口们
    abstract void brew();

    abstract void addCondiments();

    //当然不需要子类继承也能实现的算法直接在这里写也可以(同样子类也可以覆盖修改之)
    //称这种子类选择性覆盖的方法为"hook"(钩子)

    public void boilTheWater() {
        System.out.println("Bolling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}
