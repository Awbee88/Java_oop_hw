package task2;

import java.util.ArrayList;
import java.util.List;

public class MutableList<T> extends AbstractList<T> {

    public MutableList(List<T> collection) {
        super(collection);
    }

    @Override
    public int getSize() {
        return this.collection.size();
    }

    @Override
    public T get(int i) {
        return this.collection.get(i);
    }

    public void set(int i, T newValue) {
        this.collection.set(i, newValue);
    }

    public void add(T newValue) {
        this.collection.add(newValue);
    }

    public void remove(T value) {
        this.collection.remove(value);
    }

}
