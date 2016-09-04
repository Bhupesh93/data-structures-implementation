import com.hpe.Queue;
import com.hpe.exception.QueueEmptyException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Boobesh S on 9/4/2016.
 */
public class QueueTest {

    @Test
    public void testQueue() throws QueueEmptyException {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(1);
        Assert.assertEquals("should be 1 ",Integer.valueOf(1),queue.remove());
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        Assert.assertEquals("should be 2 ",Integer.valueOf(2),queue.remove());
        Assert.assertEquals("should be 3 ",Integer.valueOf(3),queue.remove());
        Assert.assertEquals("should be 4 ",Integer.valueOf(4),queue.remove());
    }

    @Test(expected = QueueEmptyException.class)
    public  void testQueueEmptyException() throws QueueEmptyException {
        Queue<Integer> queue = new Queue<Integer>();
        queue.remove();
    }
}
