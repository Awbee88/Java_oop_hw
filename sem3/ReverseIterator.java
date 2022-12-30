package sem3;

import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {

    private Group studentsGroup;
    private int index;

    public ReverseIterator(Group studentsGroup) {
        this.studentsGroup = studentsGroup;
        index = studentsGroup.getSize() - 1;
    }

    @Override
    public boolean hasNext() {
        return index > -1;
    }

    @Override
    public Student next() {
        return studentsGroup.get(index--);
    }

}
