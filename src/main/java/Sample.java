import java.util.*;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello Coinbase!!");
        List<IListIterator> input = new ArrayList<>();
        input.add(new ListIterator(Arrays.asList(1, 2, 3)));
        input.add(new ListIterator(Arrays.asList(4, 5)));
        input.add(new ListIterator(Arrays.asList(6)));
        input.add(new ListIterator(Arrays.asList()));
        input.add(new ListIterator(Arrays.asList(7, 8, 9)));
        List<Integer> output = interleaveListIterator(input);
        System.out.println(output);
    }

    private static List<Integer> interleave(List<List<Integer>> input) {
        Queue<Integer> result = new ArrayDeque<>();
        if (input.size() == 0)
            return new ArrayList<>(result);
        boolean reachedEnd = false;
        int maxLengthReached = 0;
        for (int index = 0; reachedEnd == false; index++) {
            maxLengthReached = 0;
            for (int listIndex = 0; listIndex < input.size(); listIndex++) {
                List<Integer> list = input.get(listIndex);
                if (list.size() > index) {
                    result.offer(list.get(index));
                } else {
                    maxLengthReached++;
                }
            }
            if (maxLengthReached == input.size())
                reachedEnd = true;
        }
        return new ArrayList<>(result);
    }


    public static List<Integer> interleaveListIterator(List<IListIterator> input) {
        Queue<Integer> result = new ArrayDeque<>();
        if (input.size() == 0)
            return new ArrayList<>(result);
        boolean reachedEnd = false;
        int maxLengthReached = 0;
        while (reachedEnd == false) {
            maxLengthReached = 0;
            for (int listIndex = 0; listIndex < input.size(); listIndex++) {
                IListIterator list = input.get(listIndex);
                if (list.hasNext()) {
                    result.offer(list.next());
                } else {
                    maxLengthReached++;
                }
            }
            if (maxLengthReached == input.size())
                reachedEnd = true;
        }
        return new ArrayList<>(result);
    }
}
