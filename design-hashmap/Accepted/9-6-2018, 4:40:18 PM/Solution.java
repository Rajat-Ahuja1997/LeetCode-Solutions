// https://leetcode.com/problems/design-hashmap

class MyHashMap {
    List<Integer> list;
    /** Initialize your data structure here. */
    public MyHashMap() {
        list = new ArrayList<>();
        for(int i = 0; i < 1000000; i++) {
            list.add(null);
        }
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        list.set(key, value);
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if (list.get(key) == null) {
            return -1;
        }
        else {
            return list.get(key);
        }
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if (list.get(key) != null) {
            list.set(key, null);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */