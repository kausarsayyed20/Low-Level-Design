package CacheWithEviction.Storage;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasedStorage implements Storage{

    public int getCapacity() {
        return capacity;
    }

    final int capacity;
    static Map<String,String> map;
    public HashMapBasedStorage(int capacity)
    {
        this.capacity = capacity;
        map=new HashMap<>();
    }
    @Override
    public String get(String key) {
        return map.get(key);
    }

    @Override
    public void put(String key, String value) {
        map.put(key,value);
    }

    public boolean isFull(){
        if(map.size() == capacity)
        {
            return true;
        }
        return false;
    }

    public void remove(String key)
    {
        map.remove(key);
    }

    public static void print(){
        System.out.print(map);
    }
}
