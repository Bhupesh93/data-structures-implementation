import com.hpe.maxHeap.MaxHeap;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Boobesh S on 9/6/2016.
 */
public class MaxHeapTest {


    @Test
    public void testInsertAndRemoval() {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(2);
        maxHeap.insert(4);
        maxHeap.insert(1);
        maxHeap.insert(6);
        maxHeap.insert(5);
        maxHeap.display();
        Assert.assertEquals(maxHeap.remove(), 6);
        maxHeap.display();
        Assert.assertEquals(maxHeap.remove(), 5);
        maxHeap.display();
        Assert.assertEquals(maxHeap.remove(), 4);
        maxHeap.display();
        Assert.assertEquals(maxHeap.remove(), 2);
        maxHeap.display();
        Assert.assertEquals(maxHeap.remove(), 1);
        maxHeap.display();


    }


}
