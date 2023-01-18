package task1;

public class FingerUnlocker implements Unlocker {
    private String fingerprint; // на случай отпечатка пальца

    public FingerUnlocker(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован с помощью отпечатка пальца");

    }
}
