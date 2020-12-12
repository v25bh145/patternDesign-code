package beverage;

//通用父类，拥有装饰者与被装饰者共同的字段
public abstract class Beverage {

    public String description = "Unknown beverage.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
