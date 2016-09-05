import com.hpe.exception.QueueEmptyException;
import com.hpe.graph.AdjacencyGraph;
import org.junit.Test;

/**
 * Created by Boobesh S on 9/5/2016.
 */
public class AdjacencyGraphTest {

    @Test
    public void testDepthFirst(){
        AdjacencyGraph graph = new AdjacencyGraph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.DepthFirst(0);
    }

    @Test
    public void testBreadthFirst() throws QueueEmptyException {
        AdjacencyGraph graph = new AdjacencyGraph(7);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,6);
        graph.addEdge(1,5);
        graph.addEdge(1,3);
        graph.addEdge(3,4);
        graph.breadthFirstSearch(0);
    }

}

