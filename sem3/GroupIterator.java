package sem3;

import java.util.Iterator;

public class GroupIterator implements Iterator<Student> {

    private Group studentsGroup;
    private int index = 0;

    public GroupIterator(Group studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studentsGroup.getSize();
    }

    @Override
    public Student next() {
        return studentsGroup.get(index++);
    }

}
