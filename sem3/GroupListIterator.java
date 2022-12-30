package sem3;

import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {

    private Group studentsGroup;
    private int index;

    

    public GroupListIterator(Group studentsGroup, int index) {
        this.studentsGroup = studentsGroup;
        this.index = index;

    }
    
    
    @Override
    public boolean hasNext() {
        return index < studentsGroup.getSize();
    }

    @Override
    public boolean hasPrevious() {
        return index > -1;
    }

    @Override
    public Student next() {
        return studentsGroup.get(index++);
    }

    @Override
    public int nextIndex() {
        if (index + 1 < studentsGroup.getSize()) {
            return index + 1;
        } else {
            return studentsGroup.getSize();
        }
    }

    @Override
    public Student previous() {
        return studentsGroup.get(index--);
    }

    @Override
    public int previousIndex() {
        if (index - 1 > -1) {
            return index - 1;
        } else {
            return -1;
        }
    }








    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }

    @Override
    public void set(Student e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void add(Student e) {
        // TODO Auto-generated method stub

    }

}
