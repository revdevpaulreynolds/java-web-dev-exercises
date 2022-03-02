package exercises.technology;

public abstract class Computer {
    private String ipAddress;
    private String operatingSystem;
    private String owner;
    private boolean isOn = false;

    public Computer(String aIpAddress, String aOperatingSystem, String aOwner) {
        ipAddress = aIpAddress;
        operatingSystem = aOperatingSystem;
        owner = aOwner;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void switchPower() {
        isOn = !isOn;
    }

    public void sell(String newOwner) {
        owner = newOwner;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getOwner() {
        return owner;
    }

    public boolean getIsOn() {
        return isOn;
    }

}
