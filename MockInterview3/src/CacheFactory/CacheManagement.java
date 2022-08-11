package CacheFactory;
import EvictionPolicy.EvictionPolicies;
import EvictionPolicy.LRUEvictionPolicy;
import Storage.HashMapBasedStorage;
import Storage.Storage;
import ThreadHandler.Thread1;
import service.Cache;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CacheManagement {
    public CacheManagement(){

    }

    public void runCache(int capacity)
    {
        Storage storage = new HashMapBasedStorage(capacity);
        EvictionPolicies evictionPolicies = new LRUEvictionPolicy();
        Cache cache =new Cache(storage,evictionPolicies);
//        evictionPolicies.keyAccessed(1);
//        evictionPolicies.keyAccessed(2);
//        evictionPolicies.keyAccessed(3);
//        evictionPolicies.removeKey(1);
//        evictionPolicies.print();
        //Thread1 thread1 =new Thread1(new HashMapBasedStorage(capacity));
        List<Thread1> list =new ArrayList<>();
        for(int i=0;i<1;i++)
        {
            list.add(new Thread1(capacity));
        }

        for(int i=0;i<1;i++)
        {
            list.get(i).run();
        }

    }
}
