package io.futurera.algorithm;

import java.util.Iterator;

public class BSTIterator implements Iterator {
	@Override public boolean hasNext() {
		return false;
	}

	@Override public Object next() {
		return null;
	}

	class TreeNode {
		public int val;
		public TreeNode left, right;
		public TreeNode(int val) {
			this.val = val;
			this.left = this.right = null;
		}
	}
}
