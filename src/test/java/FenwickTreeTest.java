
import java.util.List;
import no.fasmer.fenwicktree.FenwickTree;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * 
 * @author eef
 */
public class FenwickTreeTest {

    @Test
    public void varArgsConstructorTest() {
        final int[] values = new int[] {0,0,0,0,0,0,0,0,0,0};
        final FenwickTree tree = new FenwickTree(values);
        
        assertThat(tree.getNumNodes(), is(10));
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(5), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(6), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(7), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(8), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(9), is(0));
        
        assertThat(tree.getFrequencyOfNode(0), is(0));
        assertThat(tree.getFrequencyOfNode(1), is(0));
        assertThat(tree.getFrequencyOfNode(2), is(0));
        assertThat(tree.getFrequencyOfNode(3), is(0));
        assertThat(tree.getFrequencyOfNode(4), is(0));
        assertThat(tree.getFrequencyOfNode(5), is(0));
        assertThat(tree.getFrequencyOfNode(6), is(0));
        assertThat(tree.getFrequencyOfNode(7), is(0));
        assertThat(tree.getFrequencyOfNode(8), is(0));
        assertThat(tree.getFrequencyOfNode(9), is(0));
        
        tree.incrementFrequencyOfNode(1, 5);
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(5), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(6), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(7), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(8), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(9), is(5));
        
        assertThat(tree.getFrequencyOfNode(0), is(0));
        assertThat(tree.getFrequencyOfNode(1), is(5));
        assertThat(tree.getFrequencyOfNode(2), is(0));
        assertThat(tree.getFrequencyOfNode(3), is(0));
        assertThat(tree.getFrequencyOfNode(4), is(0));
        assertThat(tree.getFrequencyOfNode(5), is(0));
        assertThat(tree.getFrequencyOfNode(6), is(0));
        assertThat(tree.getFrequencyOfNode(7), is(0));
        assertThat(tree.getFrequencyOfNode(8), is(0));
        assertThat(tree.getFrequencyOfNode(9), is(0));
        
        tree.incrementFrequencyOfNode(7,-5);
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(5), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(6), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(7), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(8), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(9), is(0));
        
        assertThat(tree.getFrequencyOfNode(0), is(0));
        assertThat(tree.getFrequencyOfNode(1), is(5));
        assertThat(tree.getFrequencyOfNode(2), is(0));
        assertThat(tree.getFrequencyOfNode(3), is(0));
        assertThat(tree.getFrequencyOfNode(4), is(0));
        assertThat(tree.getFrequencyOfNode(5), is(0));
        assertThat(tree.getFrequencyOfNode(6), is(0));
        assertThat(tree.getFrequencyOfNode(7), is(-5));
        assertThat(tree.getFrequencyOfNode(8), is(0));
        assertThat(tree.getFrequencyOfNode(9), is(0));
        
        tree.incrementFrequencyOfNode(9,7);
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(5), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(6), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(7), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(8), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(9), is(7));
        
        assertThat(tree.getFrequencyOfNode(0), is(0));
        assertThat(tree.getFrequencyOfNode(1), is(5));
        assertThat(tree.getFrequencyOfNode(2), is(0));
        assertThat(tree.getFrequencyOfNode(3), is(0));
        assertThat(tree.getFrequencyOfNode(4), is(0));
        assertThat(tree.getFrequencyOfNode(5), is(0));
        assertThat(tree.getFrequencyOfNode(6), is(0));
        assertThat(tree.getFrequencyOfNode(7), is(-5));
        assertThat(tree.getFrequencyOfNode(8), is(0));
        assertThat(tree.getFrequencyOfNode(9), is(7));
        
    }
    
    @Test
    public void varArgsConstructorTest2() {
        final FenwickTree tree = new FenwickTree(1,0,0,0,0);
        
        assertThat(tree.getNumNodes(), is(5));
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(1));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(1));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(1));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(1));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(1));
        
        tree.incrementFrequencyOfNode(1, 3);
     
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(1));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(4));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(4));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(4));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(4));
        
        tree.incrementFrequencyOfNode(4,-3);
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(1));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(4));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(4));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(4));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(1));
    }
    
    @Test
    public void constructorWithCapacityTest() {
        final FenwickTree tree = new FenwickTree(10);
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(5), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(6), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(7), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(8), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(9), is(0));
        
        tree.incrementFrequencyOfNode(1, 5);
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(5), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(6), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(7), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(8), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(9), is(5));
        
        tree.incrementFrequencyOfNode(7,-5);
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(5), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(6), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(7), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(8), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(9), is(0));
        
        tree.incrementFrequencyOfNode(9,7);
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(5), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(6), is(5));
        assertThat(tree.getCumulativeFrequencyOfNode(7), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(8), is(0));
        assertThat(tree.getCumulativeFrequencyOfNode(9), is(7));
    }
    
    @Test
    public void test2() {
        final int[] frequencies = new int[] {1,2,3,4,5,6,7,8,9,10};
        final FenwickTree tree = new FenwickTree(frequencies);
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(1));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(3));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(6));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(10));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(15));
        assertThat(tree.getCumulativeFrequencyOfNode(5), is(21));
        assertThat(tree.getCumulativeFrequencyOfNode(6), is(28));
        assertThat(tree.getCumulativeFrequencyOfNode(7), is(36));
        assertThat(tree.getCumulativeFrequencyOfNode(8), is(45));
        assertThat(tree.getCumulativeFrequencyOfNode(9), is(55));
        
        assertThat(tree.getFrequencyOfNode(0), is(1));
        assertThat(tree.getFrequencyOfNode(1), is(2));
        assertThat(tree.getFrequencyOfNode(2), is(3));
        assertThat(tree.getFrequencyOfNode(3), is(4));
        assertThat(tree.getFrequencyOfNode(4), is(5));
        assertThat(tree.getFrequencyOfNode(5), is(6));
        assertThat(tree.getFrequencyOfNode(6), is(7));
        assertThat(tree.getFrequencyOfNode(7), is(8));
        assertThat(tree.getFrequencyOfNode(8), is(9));
        assertThat(tree.getFrequencyOfNode(9), is(10));
        
        assertThat(tree.getSumInRange(0, 9), is(55));
        assertThat(tree.getSumInRange(0, 9), is(tree.getCumulativeFrequencyOfNode(9)));
        assertThat(tree.getSumInRange(2, 4), is(12));
        assertThat(tree.getSumInRange(6, 9), is(34));
        assertThat(tree.getSumInRange(5, 9), is(40));
        assertThat(tree.getSumInRange(0, 0), is(1));
        assertThat(tree.getSumInRange(1, 1), is(2));
        assertThat(tree.getSumInRange(8, 8), is(9));
        assertThat(tree.getSumInRange(9, 9), is(10));
        
        tree.incrementFrequencyOfNode(0, -2);
        
        assertThat(tree.getCumulativeFrequencyOfNode(0), is(-1));
        assertThat(tree.getCumulativeFrequencyOfNode(1), is(1));
        assertThat(tree.getCumulativeFrequencyOfNode(2), is(4));
        assertThat(tree.getCumulativeFrequencyOfNode(3), is(8));
        assertThat(tree.getCumulativeFrequencyOfNode(4), is(13));
        assertThat(tree.getCumulativeFrequencyOfNode(5), is(19));
        assertThat(tree.getCumulativeFrequencyOfNode(6), is(26));
        assertThat(tree.getCumulativeFrequencyOfNode(7), is(34));
        assertThat(tree.getCumulativeFrequencyOfNode(8), is(43));
        assertThat(tree.getCumulativeFrequencyOfNode(9), is(53));
        
        assertThat(tree.getFrequencyOfNode(0), is(-1));
        assertThat(tree.getFrequencyOfNode(1), is(2));
        assertThat(tree.getFrequencyOfNode(2), is(3));
        assertThat(tree.getFrequencyOfNode(3), is(4));
        assertThat(tree.getFrequencyOfNode(4), is(5));
        assertThat(tree.getFrequencyOfNode(5), is(6));
        assertThat(tree.getFrequencyOfNode(6), is(7));
        assertThat(tree.getFrequencyOfNode(7), is(8));
        assertThat(tree.getFrequencyOfNode(8), is(9));
        assertThat(tree.getFrequencyOfNode(9), is(10));
    }
    
    @Test
    public void getParentTest() {
        /** Tree with decimal indexes
         *       4
         *      / \
         *     /   \
         *    /     \
         *   2       6
         *  / \     / \
         * 1   3   5   7
         */
        
        /**  Tree with binary indexes
         *       100
         *       /  \
         *      /    \
         *     /      \
         *    /        \
         *   010       110
         *  /   \     /   \
         * 001  011  101  111
         */
        
        /** Tree with binary walking directions     
         *    (empty)
         *     /   \
         *    /     \
         *   0       1
         *  / \     / \
         * 00  01  10  11
         */
        
        /**
         *  The parent of a node is the the first node you get when going
         *  up the tree along a right edge.
         */
        
        final FenwickTree tree = new FenwickTree(7);
        
        assertThat(tree.getParent(1), is(0));
        assertThat(tree.getParent(2), is(0));
        assertThat(tree.getParent(3), is(2));
        assertThat(tree.getParent(4), is(0));
        assertThat(tree.getParent(5), is(4));
        assertThat(tree.getParent(6), is(4));
        assertThat(tree.getParent(7), is(6));
    }
    
    @Test
    public void getTreeTest() {
        final FenwickTree tree = new FenwickTree(1,2,3,4,5,6,7);
        // [1, 3, 3, 10, 5, 11, 7]
        final List<Integer> bareTree = tree.getTree();
        
        // The user accesses the tree with indexes 0, 1, ..., 6
        // Internally indexes 1, 2, ..., 7 are used
        // So the frequency of node 6 from the users perspective is the sum of nodes 7, 6 and 4 in the drawing above
        assertThat(tree.getCumulativeFrequencyOfNode(6), is(bareTree.get(6)+bareTree.get(5)+bareTree.get(3)));
    }
    
}
