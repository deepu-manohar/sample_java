import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class InterleaveIteratorTests {
    @Test
    public void InterleaveIteratorTest(){
        System.out.println("testing interleaveListIterator");
        List<IListIterator> input = new ArrayList<>();
        input.add(new ListIterator(Arrays.asList(1, 2, 3)));
        input.add(new ListIterator(Arrays.asList(4, 5)));
        input.add(new ListIterator(Arrays.asList(6)));
        input.add(new ListIterator(Arrays.asList()));
        input.add(new ListIterator(Arrays.asList(7, 8, 9)));
        List<Integer> output = Sample.interleaveListIterator(input);
        Assert.assertEquals(Arrays.asList(1, 4, 6, 7, 2, 5, 8, 3, 9), output);        
    }
    
    @Test
    public void InterleaveIteratorEmptyTest(){
        System.out.println("testing interleaveListIteratorEmpty");
        List<IListIterator> input = new ArrayList<>();
        List<Integer> output = Sample.interleaveListIterator(input);
        Assert.assertEquals(Arrays.asList(), output);        
    }

    @Test
    public void InterleaveIteratorErrorTest(){
        System.out.println("testing interleaveListIteratorError");
        List<IListIterator> input = new ArrayList<>();
        input.add(new ListIterator(Arrays.asList(1, 2, 3)));
        input.add(new ListIterator(Arrays.asList(4, 5)));
        input.add(new ListIterator(Arrays.asList(6)));
        input.add(new ListIterator(Arrays.asList()));
        input.add(new ListIterator(Arrays.asList(7, 8, 9)));
        List<Integer> output = Sample.interleaveListIterator(input);
        Assert.assertNotEquals(null, output);        
    }
}
