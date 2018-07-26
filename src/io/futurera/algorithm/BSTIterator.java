package io.futurera.algorithm;

import java.util.Iterator;

public class BSTIterator implements Iterator {
	class TreeNode {
		public int val;
		public TreeNode left, right;
		public TreeNode(int val) {
			this.val = val;
			this.left = this.right = null;
		}
	}
}
