package nl.sander758.introduction;

import nl.sander758.introduction.ducks.Duck;
import nl.sander758.introduction.ducks.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
