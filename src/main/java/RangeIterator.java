public class RangeIterator implements IListIterator {
    private Integer start;
    private Integer end;
    private Integer step;
    private Integer currentElement;

    public RangeIterator(Integer start, Integer end, Integer step) {
        this.start = start;
        this.end = end;
        this.step = step;
        this.currentElement = start;
    }

    @Override
    public Integer next() {
        if (currentElement == null)
            throw new RuntimeException("No further data!!");
        int temp = currentElement;
        if (currentElement != null)
            currentElement = currentElement + step > end ? null : currentElement + step;
        return temp;
    }

    @Override
    public boolean hasNext() {
        return currentElement != null;
    }
}
