package Presenter;

import java.util.Scanner;

import Model.AttendanceService;
import View.AttendanceVIew;

public class Presenter {

    private AttendanceService model;
    private AttendanceVIew view;

    public Presenter(AttendanceService model, AttendanceVIew view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean isOk = true;
        int menuItem;
        while (isOk) {
            view.showMenu();
            menuItem = sc.nextInt();
            switch (menuItem) {
                case 1:
                    view.printStudentAttendance();
                    ;
                    break;
                case 2:
                    view.printSortedStudentAttendace();
                    break;
                case 3:
                    view.printLowStudentAttendace();
                    break;
                case 0:
                    isOk = false;
                    break;

                default:
                    System.out.println("Что-то пошло не так!");
            }
        }
        sc.close();
    }

}
