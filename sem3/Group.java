package sem3;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Group implements Iterable<Student> {
    private List<Student> students;
    

    public Group(List<Student> students) {
        this.students = students;
    }

    public Student get(int index) {
        return students.get(index);
    }

    public int getSize() {
        return students.size();
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(this);
    }
    
    public Iterator<Student> reverseIterator() {
        return new ReverseIterator(this);
    }

    public ListIterator<Student> listIterator(int index) {
        return new GroupListIterator(this, index);
    }

    
}



