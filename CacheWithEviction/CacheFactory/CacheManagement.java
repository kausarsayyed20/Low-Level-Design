package CacheWithEviction.CacheFactory;

import CacheWithEviction.Policy.EvictionPolicy;
import CacheWithEviction.Policy.LRUEvictionPolicy;
import CacheWithEviction.Service.Cache;
import CacheWithEviction.Storage.HashMapBasedStorage;
import CacheWithEviction.Storage.Storage;


public class CacheManagement {
    public CacheManagement(){

    }
    public void runCache(int capacity)
    {
        Storage storage = new HashMapBasedStorage(capacity);
        EvictionPolicy evictionPolicy = new LRUEvictionPolicy();
        //
        Cache cache = new Cache(storage, evictionPolicy);
        cache.put("1","1");
        cache.put("2","2");
        cache.put("3","3");

    }


}
