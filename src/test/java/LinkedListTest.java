import LinkedList.LinkedList;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Boobesh S on 8/27/2016.
 */
public class LinkedListTest {
    @Test
    public void testAdd(){
        LinkedList<Integer> integerList = new LinkedList<Integer>();
        integerList.add(1);
        Assert.assertEquals("should have size 1",1,integerList.size());
        integerList.add(2);
        Assert.assertEquals("should have size 2",2,integerList.size());
        LinkedList<String> stringList = new LinkedList<String>();
        stringList.add("one");
        Assert.assertEquals("should have size 1",1,stringList.size());
        stringList.add("two");
        Assert.assertEquals("should have size 2",2,stringList.size());

    }
    @Test
    public void testRemove(){
        LinkedList<Integer> integerList = new LinkedList<Integer>();
        integerList.add(1);
        Assert.assertEquals("should returns 1",integerList.remove(),Integer.valueOf(1));
        Assert.assertEquals("should have size 0",0,integerList.size());
        integerList.add(1);
        integerList.add(2);
        Assert.assertEquals("should have size 2",integerList.remove(),Integer.valueOf(2));
        Assert.assertEquals("should have size 0",1,integerList.size());
    }
    @Test
    public void testCompareTo(){
        LinkedList<Integer> integerList = new LinkedList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Assert.assertTrue("should returns true",integerList.contains(1));
        Assert.assertFalse("should returns false",integerList.contains(9));

        LinkedList<String> stringList = new LinkedList<String>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        Assert.assertTrue("should returns true",stringList.contains("three"));
        Assert.assertFalse("should returns false",stringList.contains("threes"));
    }

    @Test
    public void testIsEmtpy(){
        LinkedList<Integer> integerList = new LinkedList<Integer>();
        Assert.assertEquals("should be empty",true,integerList.isEmtpy());
        integerList.add(1);
        Assert.assertEquals("should not be empty",false,integerList.isEmtpy());
    }
}
