class MyHashMap {
    private int[] map;

    public MyHashMap() {
        // Initialize an array large enough for the given constraints (0 <= key <= 10^6)
        map = new int[1000001];
        // Set all values to -1 (meaning no key is stored yet)
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value;
    }

    public int get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */