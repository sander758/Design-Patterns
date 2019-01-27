package nl.sander758.introduction.ducks;

import nl.sander758.introduction.quacking.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No quacking here");
    }
}
