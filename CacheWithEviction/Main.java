package CacheWithEviction;

import CacheWithEviction.CacheFactory.CacheManagement;
import CacheWithEviction.Storage.HashMapBasedStorage;

public class Main {
    public static  void main(String args[]) {

        CacheManagement cacheManagement = new CacheManagement();
        cacheManagement.runCache(2);
        HashMapBasedStorage.print();
    }
}
