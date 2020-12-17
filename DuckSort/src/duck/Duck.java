package duck;

public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return "Duck name: " + name + ", weight: " + weight;
    }


    @Override
    public int compareTo(Object o) {

        Duck anotherDuck = (Duck)o;

        //从小到大排序
//        if(this.weight < anotherDuck.weight) return -1;
//        else if(this.weight == anotherDuck.weight) return 0;
//        else return 1;
        return Integer.compare(this.weight, anotherDuck.weight);
    }
}
