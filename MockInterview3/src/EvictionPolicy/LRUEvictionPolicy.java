package EvictionPolicy;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUEvictionPolicy implements EvictionPolicies{
    Deque<Integer> deque;
    Map<Integer, Deque> mapper;
    public LRUEvictionPolicy(){
        deque = new LinkedList<>();
        mapper =new HashMap<>();
    }
    @Override
    public int keyAccessed(int key) {
        //System.out.println("Call4");
       // System.out.println("dequeue: "+deque);
        if(mapper.containsKey(key))
        {
            deque.remove(key);
            deque.addLast(key);
        }
        else{
            deque.add(key);
            mapper.put(key,deque);
        }
        System.out.println(key+ " Element insert dequeue: "+deque);
        return key;
    }

    @Override
    public int removeKey(int key) {
       // System.out.println("Call5");
        int element = deque.pollFirst();
        System.out.println("removed element: "+element);

        return element;
    }

    @Override
    public void print() {
        System.out.println("dequeue: "+deque);
    }
}
