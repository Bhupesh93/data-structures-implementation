import com.hpe.tree.BSTree;

/**
 * Created by Boobesh S on 8/27/2016.
 */
public class Application {
    public static void main(String[] arg){
        BSTree<Integer> BSTree = new BSTree<Integer>();
        BSTree.display();
        BSTree.insert(6);
        BSTree.display();
        BSTree.insert(3);
        BSTree.insert(4);
        BSTree.insert(2);
        BSTree.display();
        System.out.println(" number of nodes "+BSTree.countNoOfNodes());

        /*LinkedList<Integer> nameList = new LinkedList<Integer>(1);
        nameList.display();
        System.out.println("Number of elements in the list "+nameList.size());
        nameList.add(2);
        nameList.display();
        nameList.add(3);
        System.out.println(" Element 7 present in the list "+nameList.contains(7));

        nameList.display();
        nameList.add(4);
        nameList.display();
        System.out.println("Number of elements in the list "+nameList.size());
        System.out.println(nameList.remove());
        nameList.display();
        System.out.println("Number of elements in the list "+nameList.size());
        System.out.println(nameList.remove());
        System.out.println("Number of elements in the list "+nameList.size());
        System.out.println(nameList.remove());
        System.out.println("Number of elements in the list "+nameList.size());
        System.out.println("Is Empty "+nameList.isEmtpy());
        System.out.println(nameList.remove());
        System.out.println("Number of elements in the list "+nameList.size());
        System.out.println("Is Empty "+nameList.isEmtpy());
*/
    }
}
