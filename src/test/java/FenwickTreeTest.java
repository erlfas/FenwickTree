
import no.fasmer.fenwicktree.FenwickTree;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
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
        
        System.out.println(tree.getFrequencyOfNode(0));
        System.out.println(tree.getFrequencyOfNode(1));
        System.out.println(tree.getFrequencyOfNode(2));
        System.out.println(tree.getFrequencyOfNode(3));
        System.out.println(tree.getFrequencyOfNode(4));
        System.out.println(tree.getFrequencyOfNode(5));
        System.out.println(tree.getFrequencyOfNode(6));
        System.out.println(tree.getFrequencyOfNode(7));
        System.out.println(tree.getFrequencyOfNode(8));
        System.out.println(tree.getFrequencyOfNode(9));
        
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
    
}
