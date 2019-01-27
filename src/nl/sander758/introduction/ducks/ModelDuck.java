package nl.sander758.introduction.ducks;

import nl.sander758.introduction.flying.FlyNoWay;
import nl.sander758.introduction.quacking.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
