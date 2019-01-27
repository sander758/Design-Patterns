package nl.sander758.strategy.flying;

public class FlyRockedPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
