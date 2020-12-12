package ingredient;

//众多原料类，这里做了个包装方便聚合
public class Ingredients {
    public static abstract class Dough{}
    public static abstract class Sauce{}
    public static abstract class Cheese{}
    public static abstract class Veggies{}
    public static abstract class Pepperoni{}
    public static abstract class Clams{}

    public static class ThinCrustDough extends Dough {}
    public static class MarinaraSauce extends Sauce {}
    public static class ReggianoCheese extends Cheese {}
    public static class Garlic extends Veggies {}
    public static class Onion extends Veggies {}
    public static class Mushroom extends Veggies {}
    public static class RedPepper extends Veggies {}
    public static class SlicedPepperoni extends Pepperoni {}
    public static class FreshClams extends Clams {}


}
