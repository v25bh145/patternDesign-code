package ProxyPatten.State;

//状态接口以及四个行为
//我们将糖果抽奖机的状态转换算法(状态行为)提出来放到这里，在糖果抽奖机内添加一系列状态的getter与setter
//小问题: 为何要把四个状态的变量放到糖果抽奖机中呢？我认为糖果抽奖机只需要放state变量即可(一个对象做了两种事)
//例如，将四个状态封装成另外一个东东，然后用Getter如何？

//TODO: 可以将state设计为抽象类，提供默认方法
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
