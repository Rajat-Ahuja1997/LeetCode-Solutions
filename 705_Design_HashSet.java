class MyHashSet {
    List<Integer> list;
    /** Initialize your data structure here. */
    public MyHashSet() {
        list = new ArrayList<>();
    }
    
    public void add(int key) {
        if (!list.contains(key)) {
            list.add(key);
        }
    }
    
    public void remove(int key) {
        if (list.contains(key)) {
            list.remove(Integer.valueOf(key));
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if (list.contains(key)) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */