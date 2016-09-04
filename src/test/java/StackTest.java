import com.hpe.Stack;
import com.hpe.exception.StackEmtpyException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Boobesh S on 9/4/2016.
 */
public class StackTest {

    @Test
    public void testStack() throws StackEmtpyException {
        Stack<Integer> stack = new Stack<Integer>();
        Assert.assertTrue("stack is empty ",stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assert.assertEquals("should get 3",stack.pop(),Integer.valueOf(3));
        Assert.assertEquals("should get 2",stack.pop(),Integer.valueOf(2));
        Assert.assertEquals("should get 1",stack.pop(),Integer.valueOf(1));
    }

    @Test(expected = StackEmtpyException.class)
    public void testException() throws StackEmtpyException {
        Stack<Integer> stack = new Stack<Integer>();
        stack.pop();
    }

}
