package io.futurera.algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;

public class LFUCacheTestRunner {

    /**
     * Put your code in the inner LFUCache class. Design and implement a data 
     * structure for Least Frequently Used (LFU) cache. It should support the 
     * following operations: get and put. 
     * 
     * get(key) - Get the value (will always be positive) of the key if the key 
     * exists in the cache, otherwise return -1. 
     * 
     * put(key, value) - Set or insert the value if the key is not already present. 
     * When the cache reaches its capacity, it should invalidate the least frequently 
     * used item before inserting a new item. For the purpose of this problem, when there 
     * is a tie (i.e., two or more keys that have the same frequency), the least recently 
     * used key would be evicted.
     */
    static private class LFUCache {
        public LFUCache(int capacity) {
        }

        public int get(int key) {
            return 0;
        }

        public void put(int key, int value) {
        }
    }
    
    /**********************************************************************
     *                                                                    *
     * Below are to test your codes. DO NOT LOOK WHEN YOU ARE CODING!     *
     *                                                                    *
     **********************************************************************/

    private static final int NUM_OPERATIONS = 1000;
    private static final int NUM_BOUND = 20;

    private LFUCacheExpected golden;
    private LFUCache sut;

    public LFUCacheTestRunner(LFUCacheExpected golden, LFUCache sut) {
        this.golden = golden;
        this.sut = sut;
    }

    public static void main(String[] args) {
        int size = 3;

        System.out.println("=============\nFirst Test. Size = " + size + "\n");
        LFUCacheTestRunner test = new LFUCacheTestRunner(new LFUCacheExpected(size), new LFUCache(size));
        test.put(2, 2);
        test.put(1, 1);
        test.get(2);
        test.get(1);
        test.get(2);
        test.put(3, 3);
        test.put(4, 4);
        test.get(3);
        test.get(4);
        test.get(3);
        test.get(2);
        test.get(1);
        test.get(4);

        System.out.println("=============\nSecond Test. Size = " + size + "\n");
        test = new LFUCacheTestRunner(new LFUCacheExpected(size), new LFUCache(size));
        test.put(1, 10);
        test.put(2, 20);
        test.put(3, 30);
        test.get(1);
        test.put(4, 40);
        test.get(4);
        test.get(3);
        test.get(2);
        test.get(1);
        test.put(5, 50);
        test.get(1);
        test.get(2);
        test.get(3);
        test.get(4);
        test.get(5);

        System.out.println("=============\nThird Test. Size = " + size + "\n");
        Random random = new Random();
        size = random.nextInt(5) + 1;
        test = new LFUCacheTestRunner(new LFUCacheExpected(size), new LFUCache(size));
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            Operation operation = randomOperation();
            test.operate(operation);
        }

        System.out.println("--------------------\nTest DONE");
    }

    private static Operation randomOperation() {
        Random random = new Random();
        Action action = random.nextBoolean() ? Action.GET : Action.PUT;
        int key = random.nextInt(NUM_BOUND);
        int value = random.nextInt(NUM_BOUND);
        return new Operation(action, key, value);
    }

    private void put(int key, int value) {
        Operation operation = new Operation(Action.PUT, key, value);
        operate(operation);
    }

    private void get(int key) {
        Operation operation = new Operation(Action.GET, key);
        operate(operation);
    }

    private void operate(Operation operation) {
        if (operation.action == Action.PUT) {
            golden.put(operation.key, operation.value);
            sut.put(operation.key, operation.value);
        }

        if (operation.action == Action.GET) {
            int expected = golden.get(operation.key);
            int actual = sut.get(operation.key);
            if (expected != actual) {
                throw new RuntimeException("\n[TEST FAILED]\nExpected :" + expected + "\nActual: " + actual + '\n');
            }
        }
    }

    private static class Operation {

        public Action action;
        public int key, value;

        // for action = PUT
        public Operation(Action action, int operand1, int operand2) {
            this.action = action;
            this.key = operand1;
            this.value = operand2;
        }

        // for action = GET
        public Operation(Action action, int operand1) {
            this.action = action;
            this.key = operand1;
        }

        @Override
        public String toString() {
            switch (action) {
            case PUT:
                return "Put(" + key + "," + value + ")";
            case GET:
                return "Get(" + key + ")";
            default:
                return "Unknown operation";
            }
        }
    }

    private enum Action {
        GET, PUT
    };

    private static class LFUCacheExpected {

        private final Map<Integer, CacheNode> cache;
        private final LinkedHashSet[] frequencyList;
        private int lowestFrequency;
        private int maxFrequency;
        private final int maxCacheSize;

        public LFUCacheExpected(int capacity) {
            this.cache = new HashMap<Integer, CacheNode>(capacity);
            this.frequencyList = new LinkedHashSet[capacity * 2];
            this.lowestFrequency = 0;
            this.maxFrequency = capacity * 2 - 1;
            this.maxCacheSize = capacity;
            initFrequencyList();
        }

        public void put(int key, int value) {
            CacheNode currentNode = cache.get(key);
            if (currentNode == null) {
                if (cache.size() == maxCacheSize) {
                    doEviction();
                }
                LinkedHashSet<CacheNode> nodes = frequencyList[0];
                currentNode = new CacheNode(key, value, 0);
                nodes.add(currentNode);
                cache.put(key, currentNode);
                lowestFrequency = 0;
            } else {
                currentNode.v = value;
            }
            addFrequency(currentNode);
        }

        public int get(int key) {
            // Write your code here
            CacheNode currentNode = cache.get(key);
            if (currentNode != null) {
                addFrequency(currentNode);
                return currentNode.v;
            } else {
                return -1;
            }
        }

        public void addFrequency(CacheNode currentNode) {
            int currentFrequency = currentNode.frequency;
            if (currentFrequency < maxFrequency) {
                int nextFrequency = currentFrequency + 1;
                LinkedHashSet<CacheNode> currentNodes = frequencyList[currentFrequency];
                LinkedHashSet<CacheNode> newNodes = frequencyList[nextFrequency];
                moveToNextFrequency(currentNode, nextFrequency, currentNodes, newNodes);
                cache.put(currentNode.k, currentNode);
                if (lowestFrequency == currentFrequency && currentNodes.isEmpty()) {
                    lowestFrequency = nextFrequency;
                }
            } else {
                // Hybrid with LRU: put most recently accessed ahead of others:
                LinkedHashSet<CacheNode> nodes = frequencyList[currentFrequency];
                nodes.remove(currentNode);
                nodes.add(currentNode);
            }
        }

        public int remove(int key) {
            CacheNode currentNode = cache.remove(key);
            if (currentNode != null) {
                LinkedHashSet<CacheNode> nodes = frequencyList[currentNode.frequency];
                nodes.remove(currentNode);
                if (lowestFrequency == currentNode.frequency) {
                    findNextLowestFrequency();
                }
                return currentNode.v;
            } else {
                return -1;
            }
        }

        public int frequencyOf(int key) {
            CacheNode node = cache.get(key);
            if (node != null) {
                return node.frequency + 1;
            } else {
                return 0;
            }
        }

        public void clear() {
            for (int i = 0; i <= maxFrequency; i++) {
                frequencyList[i].clear();
            }
            cache.clear();
            lowestFrequency = 0;
        }

        public int size() {
            return cache.size();
        }

        public boolean isEmpty() {
            return this.cache.isEmpty();
        }

        public boolean containsKey(int key) {
            return this.cache.containsKey(key);
        }

        private void initFrequencyList() {
            for (int i = 0; i <= maxFrequency; i++) {
                frequencyList[i] = new LinkedHashSet<CacheNode>();
            }
        }

        private void doEviction() {
            int currentlyDeleted = 0;
            double target = 1; // just one
            while (currentlyDeleted < target) {
                LinkedHashSet<CacheNode> nodes = frequencyList[lowestFrequency];
                if (nodes.isEmpty()) {
                    break;
                } else {
                    Iterator<CacheNode> it = nodes.iterator();
                    while (it.hasNext() && currentlyDeleted++ < target) {
                        CacheNode node = it.next();
                        it.remove();
                        cache.remove(node.k);
                    }
                    if (!it.hasNext()) {
                        findNextLowestFrequency();
                    }
                }
            }
        }

        private void moveToNextFrequency(CacheNode currentNode, int nextFrequency,
                LinkedHashSet<CacheNode> currentNodes, LinkedHashSet<CacheNode> newNodes) {
            currentNodes.remove(currentNode);
            newNodes.add(currentNode);
            currentNode.frequency = nextFrequency;
        }

        private void findNextLowestFrequency() {
            while (lowestFrequency <= maxFrequency && frequencyList[lowestFrequency].isEmpty()) {
                lowestFrequency++;
            }
            if (lowestFrequency > maxFrequency) {
                lowestFrequency = 0;
            }
        }

        private class CacheNode {
            public final int k;
            public int v;
            public int frequency;

            public CacheNode(int k, int v, int frequency) {
                this.k = k;
                this.v = v;
                this.frequency = frequency;
            }
        }
    }
}
