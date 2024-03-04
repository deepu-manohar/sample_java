import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class ListIterator implements IListIterator {
    Queue<Integer> queue;

    public ListIterator() {
        queue = new ArrayDeque<>();
    }

    public ListIterator(List<Integer> inputList) {
        if (inputList == null || inputList.size() == 0) {
            queue = new ArrayDeque<>();
            return;
        }
        this.queue = new ArrayDeque<>(inputList);
    }

    @Override
    public Integer next() {
        if (queue.isEmpty())
            throw new RuntimeException("Empty data set");
        return queue.poll();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
