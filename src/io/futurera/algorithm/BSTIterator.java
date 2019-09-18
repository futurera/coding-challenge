package io.futurera.algorithm;

/**
 * put your codes in this inner class, and the inner TreeNode class if needed.
 * Implement an iterator over a binary search tree (BST). Your iterator will be
 * initialized with the root node of a BST. Calling next() will return the next
 * smallest number in the BST. Note: next() and hasNext() should run in average
 * O(1) time and uses O(h) memory, where h is the height of the tree. *
 */
public class BSTIterator {

    public BSTIterator(TreeNode root) {

    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
}