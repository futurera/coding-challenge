package io.futurera.algorithm;

import java.util.*;

public class LFUCache {
	HashMap<Integer, Node> cacheMap;
	LinkedHashSet<Integer> recentSet;

	class Node {
		int key;
		int value;
		int freq;
		public Node (int key, int value, int freq) {
			this.key = key;
			this.value = value;
			this.freq = freq;
		}
	}

	public LFUCache(int capacity) {
	}

	public int get(int key) {
		return -1;
	}

	public void set(int key, int value) {
	}
}