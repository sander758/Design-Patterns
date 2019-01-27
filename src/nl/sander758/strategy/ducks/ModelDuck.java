package nl.sander758.strategy.ducks;

import nl.sander758.strategy.flying.FlyNoWay;
import nl.sander758.strategy.quacking.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
