package nl.sander758.introduction.ducks;

import nl.sander758.introduction.flying.FlyWithWings;
import nl.sander758.introduction.quacking.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
