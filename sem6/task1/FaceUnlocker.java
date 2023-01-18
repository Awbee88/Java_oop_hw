package task1;

public class FaceUnlocker implements Unlocker {
    private String faceID;  // на случай лица

    
    public FaceUnlocker(String faceID) {
        this.faceID = faceID;
    }


    @Override
    public void unlock() {
        System.out.println("Телефон разблокирован с помощью распознавания лица");
    }
}
