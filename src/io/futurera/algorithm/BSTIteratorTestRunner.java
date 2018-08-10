package io.futurera.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BSTIteratorTestRunner {

    /**
     * put your codes in this inner class, and the inner TreeNode class if needed. Implement an 
     * iterator over a binary search tree (BST). Your iterator will be initialized with the 
     * root node of a BST. Calling next() will return the next smallest number in the BST.
     * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where 
     * h is the height of the tree.      *
     */
    public static class BSTIterator {

        public BSTIterator(TreeNode root) {

        }

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            return null;
        }

        static class TreeNode {
            public int val;
            public TreeNode left, right;

            public TreeNode(int val) {
                this.val = val;
                this.left = this.right = null;
            }
        }
    }

    /**********************************************************************
     *                                                                    *
     * Below are to test your codes. DO NOT LOOK WHEN YOU ARE CODING!     *
     *                                                                    *
     **********************************************************************/

    public static void main(String[] args) {
        List<Boolean> result = new ArrayList<>();
        result.add(testcase1());
        result.add(testcase2());
        result.add(testcase3());
        result.add(testcase4());
        long fails = result.stream().filter(r -> r == false).count();
        if (fails == 0L)
            System.out.println("All test cases passed");
        else
            System.out.println("At least one test case fails");
    }

    private static boolean testcase1() {
        // test hasNext on an empty collection (returns false)
        BSTIterator.TreeNode tn = null;
        BSTIterator iterator = new BSTIterator(tn);
        boolean expected = false;
        return expected == iterator.hasNext();
    }

    private static boolean testcase2() {
        // test next() on an empty collection (throws exception)
        BSTIterator.TreeNode tn = null;
        BSTIterator iterator = new BSTIterator(tn);
        try {
            iterator.next();
        } catch (NullPointerException e) {
            return true;
        }
        return false;
    }

    private static boolean testcase3() {
        // test hasNext on a collection with one item (returns true, several
        // times)
        BSTIterator.TreeNode tn = new BSTIterator.TreeNode(1);
        BSTIterator iterator = new BSTIterator(tn);
        boolean expected = true;
        return expected == iterator.hasNext();
    }

    private static boolean testcase4() {
        // test hasNext/next on a collection with one item: hasNext returns
        // true, next returns the item, hasNext returns false, twice
        BSTIterator.TreeNode tn = new BSTIterator.TreeNode(1);
        tn.right = new BSTIterator.TreeNode(2);
        BSTIterator iterator = new BSTIterator(tn);
        if (!iterator.hasNext())
            return false;
        iterator.next();
        return iterator.hasNext() == false;
    }
}
