package coffee;

//单独的咖啡类
//两个类的代码相似度极高
public class Coffee {

    void prepareRecipe() {
        boilTheWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilTheWater() {
        System.out.println("Bolling water");
    }
    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter!");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}
