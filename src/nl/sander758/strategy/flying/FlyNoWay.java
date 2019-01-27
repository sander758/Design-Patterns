package nl.sander758.strategy.flying;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No flying for this one");
    }
}
