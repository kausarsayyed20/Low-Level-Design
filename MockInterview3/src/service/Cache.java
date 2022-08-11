package service;

import EvictionPolicy.EvictionPolicies;
import Storage.Storage;

public class Cache {
    Storage storage;
    EvictionPolicies evictionPolicies;
    public Cache(Storage storage, EvictionPolicies evictionPolicies)
    {
        this.storage =storage;
        this.evictionPolicies = evictionPolicies;
    }

    public void put(Integer key, String value)
    {
        //System.out.println("Call1");
        if(!storage.isFull()) {
            //System.out.println("Call1");
            storage.put(key, value);
            evictionPolicies.keyAccessed(key);
            System.out.println(key + " has been inserted in cache with value " + value);
        }
        else{
            System.out.println(" remove block Call3");
            int removekey = evictionPolicies.removeKey(key);
            storage.remove(removekey);
            storage.put(key,value);
            evictionPolicies.keyAccessed(key);
            System.out.println(key + " has been inserted in cache with value " + value);
        }
        storage.print();
    }

    public String get(int key)
    {
        String value = storage.get(key);
        evictionPolicies.keyAccessed(key);
        System.out.println("Value: "+ key);
        storage.print();
        return value;
    }

}
