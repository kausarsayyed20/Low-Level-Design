package Storage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapBasedStorage implements  Storage{

    Map<Integer, String> map;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    int capacity;
    public HashMapBasedStorage(int capacity)
    {
        map =new ConcurrentHashMap<>();
        this.capacity = capacity;
    }
    @Override
    public String get(int key) {

      return map.get(key);
    }

    @Override
    public void put(int key, String value) {
        if(map.containsKey(key))
        {
            String val = map.get(key);
            map.replace(key,value);
        }
        else{
            map.put(key,value);
        }
    }

    @Override
    public boolean isFull() {
        return map.size() == capacity;
    }

    @Override
    public void remove(Integer key) {
        map.remove(key);
    }

    @Override
    public void print() {
        System.out.println("Cache:" +map);
    }
}
