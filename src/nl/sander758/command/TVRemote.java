package nl.sander758.command;

public class TVRemote {
    public static ElectronicDevice getDevice() {
        return new Television();
    }
}
