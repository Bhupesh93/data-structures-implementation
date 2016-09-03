import BinarySearchTree.BSTree;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Boobesh S on 9/3/2016.
 */
public class BSTreeTest {

    @Test
    public void testInsert() {
        BSTree tree = new BSTree(2);
        Assert.assertEquals("one element ", 1, tree.countNoOfNodes());
        tree.insert(1);
        Assert.assertEquals("Two elements ", 2, tree.countNoOfNodes());
        tree.insert(1);
        Assert.assertEquals("Two elements ", 2, tree.countNoOfNodes());
        tree.insert(7);
        tree.insert(9);
        tree.insert(10);
        Assert.assertEquals("Five elements ", 5, tree.countNoOfNodes());
    }

    @Test
    public void testFind() {
        BSTree tree = new BSTree(2);
        Assert.assertTrue("should have true ", tree.find(2));
        tree.insert(1);
        Assert.assertFalse("should have false ", tree.find(20));
    }

}
