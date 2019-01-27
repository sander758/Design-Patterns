package nl.sander758.strategy;

import nl.sander758.strategy.ducks.Duck;
import nl.sander758.strategy.ducks.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
