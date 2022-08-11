package ThreadHandler;
import EvictionPolicy.EvictionPolicies;
import EvictionPolicy.LRUEvictionPolicy;
import Storage.HashMapBasedStorage;
import Storage.Storage;
import service.Cache;

public class Thread1 implements Runnable{
    Storage storage;
    Cache cache;
    EvictionPolicies evictionPolicies;
    public Thread1(int capacity) {

        storage = new HashMapBasedStorage(capacity);
        evictionPolicies =new LRUEvictionPolicy();
        cache =new Cache(storage, evictionPolicies);

    }


    @Override
    public synchronized void run() {
        if(storage.isFull())
        {
            try {
                cache.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else{
            System.out.println("Thread: "+Thread.currentThread().getId());
            cache.put(1,"Kausar");
            cache.put(2,"Feroz");
            cache.put(3,"Mubin");
            //cache.get(1);
        }
    }
}
