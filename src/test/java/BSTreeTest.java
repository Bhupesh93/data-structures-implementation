import BinarySearchTree.BSTree;
import BinarySearchTree.Node;
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
        BSTree tree = new BSTree();
        tree.insert(5);
        tree.insert(4);
        Assert.assertTrue("should have true ", tree.find(5));
        tree.insert(1);
        Assert.assertFalse("should have false ", tree.find(20));
    }

    @Test
    public void testDelete() {
        BSTree tree = new BSTree();
        tree.insert(5);
        Assert.assertTrue("should have true ", tree.find(5));
        tree.delete(5);
        Assert.assertFalse("should have false ", tree.find(5));
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.display();
        Assert.assertTrue("should have true ", tree.find(2));
        tree.delete(2);
        Assert.assertFalse("should have false ", tree.find(2));
        Assert.assertTrue("should have true ", tree.find(3));
        tree.delete(3);
        Assert.assertFalse("should have false ", tree.find(3));

        BSTree tree1 = new BSTree();
        tree1.insert(4);
        tree1.insert(3);
        tree1.insert(2);
        Assert.assertTrue("should have true ", tree1.find(3));
        tree1.delete(3);
        Assert.assertFalse("should have false ", tree1.find(3));

        BSTree tree2 = new BSTree();
        tree2.insert(4);
        tree2.insert(6);
        tree2.insert(2);
        tree2.insert(1);
        tree2.insert(3);
        tree2.insert(7);
        tree2.display();
        Assert.assertTrue("should have true ", tree2.find(3));
        tree2.delete(3);
        Assert.assertFalse("should have false ", tree2.find(3));
        tree2.display();
        Assert.assertTrue("should have true ", tree2.find(4));
        tree2.delete(4);
        Assert.assertFalse("should have false ", tree2.find(4));
        tree2.display();
        Assert.assertTrue("should have true ", tree2.find(1));
        tree2.delete(1);
        Assert.assertFalse("should have false ", tree2.find(1));
        tree2.display();
        Assert.assertTrue("should have true ", tree2.find(2));
        tree2.delete(2);
        Assert.assertFalse("should have false ", tree2.find(2));
        tree2.display();
        Assert.assertTrue("should have true ", tree2.find(7));
        tree2.delete(7);
        Assert.assertFalse("should have false ", tree2.find(7));


        tree.insert(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(8);
        tree.insert(9);
        tree.insert(7);
        tree.insert(10);
        tree.insert(5);
        tree.display();

        Assert.assertTrue("should have true ", tree.find(5));
        tree.delete(5);
        Assert.assertFalse("should have false ", tree.find(5));

        tree.display();
        Assert.assertTrue("should have true ", tree.find(1));
        tree.delete(1);
        Assert.assertFalse("should have false ", tree.find(1));

        tree.display();
        Assert.assertTrue("should have true ", tree.find(9));
        tree.delete(9);
        Assert.assertFalse("should have false ", tree.find(9));

        tree.display();
        Assert.assertTrue("should have true ", tree.find(2));
        tree.delete(2);
        Assert.assertFalse("should have false ", tree.find(2));
        tree.display();
        Assert.assertTrue("should have true ", tree.find(3));
        tree.delete(3);
        Assert.assertFalse("should have false ", tree.find(3));
    }

    @Test
    public void testGetSuccessor() {
        BSTree tree = new BSTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        Node<Integer> root = new Node<Integer>(5);
        root.setLeft(new Node(4));
        Node<Integer> right = new Node<Integer>(7);
        root.setRight(right);
        right.setLeft(new Node(6));
        right.setRight(new Node(8));


        Assert.assertEquals("successor of 1 is 2", tree.getSuccessor(root).getData(), 6);
    }


}
