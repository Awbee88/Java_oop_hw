package task1;

public class Main {
    public static void main(String[] args) {
        Unlocker faceUnlocker = new FaceUnlocker("face1");
        faceUnlocker.unlock();
        Unlocker fingerUnlocker = new FingerUnlocker("finger1");
        fingerUnlocker.unlock();
        Unlocker pinUnlocker = new PinUnlocker(1234);
        pinUnlocker.unlock();
        Unlocker noUnlocker = new NoUnlocker();
        noUnlocker.unlock();
    }
}
