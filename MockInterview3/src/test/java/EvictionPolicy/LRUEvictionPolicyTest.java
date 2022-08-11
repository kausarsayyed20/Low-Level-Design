package EvictionPolicy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Deque;
import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class LRUEvictionPolicyTest {

    @Test
    void testKeyAccessed() {
        LRUEvictionPolicy lruEvictionPolicy = new LRUEvictionPolicy();
        assertEquals(1, lruEvictionPolicy.keyAccessed(1));
        Deque<Integer> deque = lruEvictionPolicy.deque;
        assertEquals(1, deque.size());
        assertEquals(1, ((List<Integer>) deque).get(0));
        assertEquals(1, lruEvictionPolicy.mapper.size());
    }

    @Test
    void testRemoveKey() {
        LRUEvictionPolicy lruEvictionPolicy = new LRUEvictionPolicy();
        assertEquals(1,lruEvictionPolicy.keyAccessed(1));
        assertEquals(1,lruEvictionPolicy.removeKey(1));

    }

    @Test
    void testPrint() {
        LRUEvictionPolicy lruEvictionPolicy = new LRUEvictionPolicy();
        lruEvictionPolicy.print();
        assertTrue(lruEvictionPolicy.deque.isEmpty());
        assertTrue(lruEvictionPolicy.mapper.isEmpty());
    }
}

