package StatePatten.State;

import StatePatten.Model.GumballMachine;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sold out");
    }

    @Override
    public void dispense() {
        System.out.println("Sold out");
    }
}
