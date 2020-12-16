package tea;

//单独的茶类
//两个类的代码相似度极高
public class Tea {

    void prepareRecipe() {
        boilTheWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilTheWater() {
        System.out.println("Bolling water");
    }
    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    public void addLemon() {
        System.out.println("Adding Lemon");
    }
}
