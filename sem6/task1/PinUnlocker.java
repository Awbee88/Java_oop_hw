package task1;

public class PinUnlocker implements Unlocker {
    private int pin; // на случай пин-кода

    public PinUnlocker(int pin) {
        this.pin = pin;
    }

    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован с помощью пароля");

    }
}
