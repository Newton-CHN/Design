package strategy.oo;

import strategy.pattern.Duck;

public class RedDuck extends Duck {
    @Override
    public void display() {
        System.out.println("~~red~~");
    }

    @Override
    public void fly() {
        System.out.println("++can not fly++");
    }
}
