package nl.sander758.strategy.ducks;

import nl.sander758.strategy.flying.FlyWithWings;
import nl.sander758.strategy.quacking.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
