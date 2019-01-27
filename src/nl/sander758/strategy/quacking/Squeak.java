package nl.sander758.strategy.quacking;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeeaaak!!!");
    }
}
