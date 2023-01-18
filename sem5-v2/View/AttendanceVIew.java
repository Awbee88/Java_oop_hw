package View;
import java.util.Collections;

import Model.AttendanceService;
import Model.ComporatorStudent;
import Model.Student;

public class AttendanceVIew {

    private AttendanceService model;

    public AttendanceVIew(AttendanceService model) {
        this.model = model;
    }

    public void printStudentAttendance() {
        for (Student student : model.getStudents()) {
            System.out.printf("%s has attendance %f\n", student, student.getAttendance());
        }
    }

    public void printSortedStudentAttendace() {

        Collections.sort(model.getStudents(), new ComporatorStudent());
        for (Student student : model.getStudents()) {
            System.out.printf("%s has attendance %f\n", student, student.getAttendance());
        }

    }

    public void printLowStudentAttendace() {
        for (Student student : model.getStudents()) {
            if (student.getAttendance() <= 25.0f) {
                System.out.printf("%s has attendance %f\n", student, student.getAttendance());
            }
        }
    }

    public void showMenu() {
        System.out.println("-------------------------------------------------------------------------------\n");
        System.out.println("Введите 1, чтобы распечатать всех студентов и посещаемость каждого в процентах");
        System.out.println("Введите 2, чтобы распечатать студентов, отсортировав их по убыванию посещаемости");
        System.out.println("Введите 3, чтобы распечатать студентов с посещаемостью ниже 25%");
        System.out.println("Введите 0, чтобы завершить программу");
        System.out.println("\n-------------------------------------------------------------------------------\n");
    }
}
