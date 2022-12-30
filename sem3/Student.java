package sem3;

public class Student {
    private String name;
    private float averageMark;

    public Student(String name, float averageMark) {
        this.name = name;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", averageMark=" + averageMark + "]";
    }

    
}
