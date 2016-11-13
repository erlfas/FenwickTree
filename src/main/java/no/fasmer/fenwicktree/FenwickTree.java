package no.fasmer.fenwicktree;

import java.util.ArrayList;
import java.util.List;

/**
 * A Fenwick tree is a data structure used to store and retrieve (cumulative) 
 * frequencies. A Fenwick tree is conceptually a perfect binary tree.
 * 
 * EXAMPLE:
 * A typical problem where a Fenwick tree may be used is the following: You have
 * n boxes (with indexes 0, 1, ..., n-1) and you both want to add things to them
 * and get the sum of things in boxes i, i+1, ..., j, where 0 <= i < j <= n-1.
 * 
 * With a naive approach one can get:
 * - Add: O(1)
 * - Get sum: O(n)
 * 
 * With a Fenwick tree you can get:
 * - Add: O(log n)
 * - Get sum: O(log n)
 * 
 * Given m queries to retrieve sums, the naive approach gives a time complexity
 * of O(nm) whereas the Fenwick tree gives a time complexity of O(m log n).
 * 
 * Thus the Fenwick tree is suited for the case where the number of get sum 
 * operatons outnumber the add operations.
 * 
 * @author eef
 */
public final class FenwickTree {

    private final int[] tree;
    private final int numNodes;
    
    /**
     * Constructs a Fenwick tree with the number of nodes equal to the number 
     * of elements in the array {@code frequencies} and with their inital frequencies 
     * equal to the values therein. 
     * 
     * Time complexity: O(n log n)
     * 
     * @param frequencies the initial values of the nodes of the Fenwick tree
     */
    public FenwickTree(final int... frequencies) {
        if (frequencies == null) {
            throw new IllegalArgumentException("values is null");
        }
        
        if (frequencies.length == 0) {
            throw new IllegalArgumentException("length of values is 0");
        }
        
        this.numNodes = frequencies.length;
        this.tree = new int[frequencies.length + 1];
        for (int i = 0; i < frequencies.length; ++i) {
            incrementFrequencyOfNode(i, frequencies[i]);
        }
    }
    
    /**
     * Constructs a Fenwick tree with {@code numNodes} number of nodes. The value of
     * each node is initially set to 0.
     * 
     * Time complexity: O(1)
     * 
     * @param numNodes the number of nodes that the Fenwick tree will have
     */
    public FenwickTree(final int numNodes) {
        if (numNodes <= 0) {
            throw new IllegalArgumentException("number of nodes must be > 0");
        }
        
        this.numNodes = numNodes;
        this.tree = new int[numNodes + 1];
    }
    
    /**
     * Increments the frequency of the node with the given index with the given
     * value. Conceptually this is frequency[index] += value.
     * 
     * Time complexity: O(log n)
     * 
     * @param index the index whose node will be incremented by {@code value}, 
     * in the range [0, n-1].
     * @param value the value to increment the node by. The value can be both 
     * positive and negative.
     */
    public void incrementFrequencyOfNode(final int index, final int value) {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be >= 0.");
        }
        
        int currentIndex = index + 1;
        
        while (currentIndex < this.tree.length) {
            this.tree[currentIndex] += value;
            currentIndex = getNext(currentIndex);
        }
    }
    
    /**
     * Gets the cumulative frequency of the node with the given index. This is
     * conceptually the operation to retrieve 
     * cumulativeFrequency[index] = f[0] + f[1] + ... + f[index], where f stands
     * for frequency.
     * 
     * Time complexity: O(log n)
     * 
     * @param index the index of a node, in the range [0, n-1].
     * @return the cumulative frequency of the node with the given index
     */
    public int getCumulativeFrequencyOfNode(final int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be >= 0.");
        }
        
        int currentIndex = index + 1;
        int sum = 0;
        
        while (currentIndex > 0) {
            sum += this.tree[currentIndex];
            currentIndex = getParent(currentIndex);
        }
        
        return sum;
    }
    
    /**
     * The single frequency of a node with the given index in the range
     * [0, n-1], where n is the number of nodes of the Fenwick tree. This is
     * conceptually retrieving frequency[index].
     * 
     * Time complexity: O(log n)
     * 
     * Observe this relation:
     * getFrequencyOfNode(index) = getCumulativeFrequencyOfNode(index) - getCumulativeFrequencyOfNode(index - 1)
     * 
     * @param index the index of a node in the Fenwick tree, in the range [0, n-1].
     * @return the single frequency of the given node in the Fenwick tree.
     */
    public int getFrequencyOfNode(final int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be >= 0.");
        }
        
        int currentIndex = index + 1;
        int sum = this.tree[currentIndex];
        
        if (currentIndex > 0) {
            int z = getParent(currentIndex);
            currentIndex--;
            while (currentIndex != z) {
                sum -= this.tree[currentIndex];
                currentIndex = getParent(currentIndex);
            }
        }
        
        return sum;
    }
    
    /**
     * Computes the sum of frequencies of nodes i, i + 1, ..., j
     * where 0 <= i <= j.
     * 
     * Time complexity: 2 O(log n)
     * 
     * @param i index in range [0, n-1], i <= j
     * @param j index in range [0, n-1], j >= i
     * @return 
     */
    public int getSumInRange(final int i, final int j) {
        if (i < 0) {
            throw new IllegalArgumentException("Requirement: i >= 0");
        }

        if (j < 0) {
            throw new IllegalArgumentException("Requirement: i >= 0");
        }

        if (j < i) {
            throw new IllegalArgumentException("Requirement: i <= j");
        }
        
        if (i == j) {
            return getFrequencyOfNode(i);
        }
        
        // i = 0
        // j >= 1
        // i < j
        if (i == 0) {
            return getCumulativeFrequencyOfNode(j);
        }
        
        // i > 0
        // j > 0
        // i < j
        return getCumulativeFrequencyOfNode(j) - getCumulativeFrequencyOfNode(i-1);
    }
    
    public int getNumNodes() {
        return numNodes;
    }
    
    /**
     * Time complexity: O(n)
     * 
     * @return 
     */
    public List<Integer> getTree() {
        final List<Integer> values = new ArrayList<>(this.tree.length);
        
        for (int i = 0; i < this.tree.length; ++i) {
            values.add(this.tree[i]);
        }
        
        return values;
    }
    
    int getParent(int index) {
        return index - (index & (-index));
    }
    
    int getNext(int index) {
        return index + (index & (-index));
    }
}
