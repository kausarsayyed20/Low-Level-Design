package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import EvictionPolicy.EvictionPolicies;
import EvictionPolicy.LRUEvictionPolicy;
import Storage.HashMapBasedStorage;
import Storage.Storage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CacheTest {

//    @Test
//    void testConstructor() {
//        HashMapBasedStorage storage = new HashMapBasedStorage(3);
//        Cache actualCache = new Cache(storage, new LRUEvictionPolicy());
//
//        assertTrue(actualCache.evictionPolicies instanceof LRUEvictionPolicy);
//        Storage storage1 = actualCache.storage;
//        assertTrue(storage1 instanceof HashMapBasedStorage);
//        assertEquals(3, ((HashMapBasedStorage) storage1).getCapacity());
//        assertFalse(storage1.isFull());
//    }

    @Test
    void testPut() {
        HashMapBasedStorage storage = new HashMapBasedStorage(3);
        Cache cache = new Cache(storage, new LRUEvictionPolicy());
        cache.put(1, "42");
        assertFalse(cache.storage.isFull());
    }


    @Test
    void testGet() {
        HashMapBasedStorage storage = new HashMapBasedStorage(3);
        storage.put(1,"k");
        assertEquals("k",storage.get(1));
      //  assertNull((new Cache(storage, new LRUEvictionPolicy())).get(1));
    }


}

