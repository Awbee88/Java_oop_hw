package task2;

import java.util.ArrayList;
import java.util.List;

public class ImmutableList<T> extends AbstractList<T> {

    public ImmutableList(List<T> collection) {
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

}
