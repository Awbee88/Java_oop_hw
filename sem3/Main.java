package sem3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Student> students = new LinkedList<>();
        students.add(new Student("Gena", 3.7f));
        students.add(new Student("Ivan", 4.7f));
        students.add(new Student("Max", 4.4f));

        Group studentsGroup = new Group(students);

        for (Student student : studentsGroup) {
            System.out.println(student);
        }
        System.out.println("----------------");

        GroupListIterator it = new GroupListIterator(studentsGroup, 0);
        while (it.hasNext()) {
            Student student = it.next();
            System.out.println(student);
        }

        System.out.println("-------------------------");

        GroupListIterator it2 = new GroupListIterator(studentsGroup, studentsGroup.getSize() - 1);
        while (it2.hasPrevious()) {
            Student studentPrev = it2.previous();
            System.out.println(studentPrev);
        }

        System.out.println("-----------------------");
        Iterator<Student> rIt = studentsGroup.reverseIterator();
        while (rIt.hasNext()) {
            Student prevStudent = rIt.next();
            System.out.println(prevStudent);
        }
    }
}
