import com.hpe.trie.Trie;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Boobesh S on 10/10/2016.
 */
public class TrieTest {

    @Test
    public void testTrie(){
        Trie trie  =  new Trie();
        trie.insert("hello");
        Assert.assertTrue("check hello is present ",trie.search("hello"));
        Assert.assertFalse("check hell is not present ",trie.search("hell"));
        trie.insert("hell");
        Assert.assertTrue("check hell is present ",trie.search("hell"));

    }
}
