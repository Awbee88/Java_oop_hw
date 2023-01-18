package task1;

public class NoUnlocker implements Unlocker {

    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован без пароля");
        
    }
    
}
