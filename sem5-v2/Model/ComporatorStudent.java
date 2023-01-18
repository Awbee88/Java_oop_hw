package Model;
import java.util.Comparator;

public class ComporatorStudent implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        if (s1.getAttendance() < s2.getAttendance()) {
            return 1;
        } else if (s1.getAttendance() > s2.getAttendance()) {
            return -1;
        }
        return 0;
    }

}
