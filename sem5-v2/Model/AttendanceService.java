package Model;
import java.util.List;

public class AttendanceService {

    private List<Student> students;

    public AttendanceService(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    
    
}
