package task2;

import java.util.List;

public abstract class AbstractList<T> {
    
    protected List<T> collection;
    
    public AbstractList(List<T> collection) {
        this.collection = collection;
    }
    public abstract int getSize();
    public abstract T get(int i);
}
