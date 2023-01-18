
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import Model.Attendance;
import Model.AttendanceService;
import Model.Student;
import Presenter.Presenter;
import View.AttendanceVIew;

public class Main {
    public static void main(String[] args) {

        List<Attendance> attStudent1 = Arrays.asList(new Attendance(LocalDate.of(2022, 10, 12), true),
                new Attendance(LocalDate.of(2022, 10, 15), true),
                new Attendance(LocalDate.of(2022, 11, 3), false),
                new Attendance(LocalDate.of(2022, 11, 23), false));

        List<Attendance> attStudent2 = Arrays.asList(new Attendance(LocalDate.of(2022, 10, 12), true),
                new Attendance(LocalDate.of(2022, 10, 15), false),
                new Attendance(LocalDate.of(2022, 11, 3), true),
                new Attendance(LocalDate.of(2022, 11, 23), true));

        List<Attendance> attStudent3 = Arrays.asList(new Attendance(LocalDate.of(2022, 10, 12), false),
                new Attendance(LocalDate.of(2022, 10, 15), false),
                new Attendance(LocalDate.of(2022, 11, 3), true),
                new Attendance(LocalDate.of(2022, 11, 23), false));

        List<Attendance> attStudent4 = Arrays.asList(new Attendance(LocalDate.of(2022, 10, 12), true),
                new Attendance(LocalDate.of(2022, 10, 15), true),
                new Attendance(LocalDate.of(2022, 11, 3), true),
                new Attendance(LocalDate.of(2022, 11, 23), true));

        List<Student> students = Arrays.asList(new Student("Ivan P", attStudent1),
                new Student("Maria O", attStudent2),
                new Student("Oleg I", attStudent3),
                new Student("Maxim R", attStudent4));

        AttendanceService model = new AttendanceService(students);
        AttendanceVIew view = new AttendanceVIew(model);

        Presenter presenter = new Presenter(model, view);
        presenter.run();
    }
}
