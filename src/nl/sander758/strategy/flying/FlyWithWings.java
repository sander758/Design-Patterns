package nl.sander758.strategy.flying;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with wings!");
    }
}
