package exercises.technology;

public class Laptop extends Computer {
    private boolean touchScreen;
    private int usbCPorts;

    public Laptop (String aIpAddress, String aOperatingSystem, String aOwner,
                   boolean aTouchScreen, int aUsbCPorts) {
        super(aIpAddress, aOperatingSystem, aOwner);
        touchScreen = aTouchScreen;
        usbCPorts = aUsbCPorts;
    }

    public void plugIn() {
        usbCPorts -= 1;
    }

    public void unPlug() {
        usbCPorts += 1;
    }

    public int getUsbCPorts() {
        return usbCPorts;
    }

    public boolean getTouchScreen() {
        return touchScreen;
    }
}
