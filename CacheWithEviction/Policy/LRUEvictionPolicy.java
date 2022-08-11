package CacheWithEviction.Policy;


import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LRUEvictionPolicy implements EvictionPolicy{

    Deque<String> deque;
    Map<String , Deque> mapper;
    public LRUEvictionPolicy(){
        deque = new LinkedList<>();
        mapper = new HashMap<>();
    }

    @Override
    public String keyAccessed(String key) {
        if(mapper.containsKey(key))
        {
            deque.remove(key);
            deque.add(key);
        }
        else{
            deque.add(key);
            mapper.put(key,deque);
        }
        System.out.println(deque);
        return key;
    }

    @Override
    public String removeKey(String key) {
      String element = deque.pollFirst();
        System.out.println(deque);
      return element;
    }


}
