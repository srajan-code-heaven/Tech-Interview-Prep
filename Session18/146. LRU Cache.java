class LRUCache {
    LinkedHashMap<Integer,Integer> cache;
    int capacity;
    
    public LRUCache(int capacity) {
        this.cache=new LinkedHashMap<>();
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(cache.containsKey(key))
        {
            int value=cache.get(key);
            cache.remove(key);
            cache.put(key,value);
            return value;
        }
        else
        {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key))
        {
            cache.remove(key);
            cache.put(key,value);
        }
        else
        {
            if(cache.size()==capacity)
            {
                Map.Entry<Integer,Integer> entry=cache.entrySet().iterator().next();
                int firstkey=entry.getKey();
                cache.remove(firstkey);
            }
            cache.put(key,value);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */