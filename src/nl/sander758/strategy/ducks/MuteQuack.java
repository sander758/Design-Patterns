package nl.sander758.strategy.ducks;

import nl.sander758.strategy.quacking.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No quacking here");
    }
}
