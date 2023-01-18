package Model;

import java.util.List;

public class Student {
    private String name;
    private List<Attendance> attendances;

    public Student(String name, List<Attendance> attendances) {
        this.name = name;
        this.attendances = attendances;
    }

    public float getAttendance() {
        float countAttendance = 0;

        for (Attendance att : attendances) {
            if (att.getVisited()) {
                countAttendance += 1;
            }
        }
        float res = countAttendance / (float) attendances.size() * 100;

        return res;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }

}
