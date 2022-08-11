package CacheWithEviction.Service;

import CacheWithEviction.Policy.EvictionPolicy;
import CacheWithEviction.Storage.HashMapBasedStorage;
import CacheWithEviction.Storage.Storage;


public class Cache {
//   Map<String,String> storage;
//   Map<String,String> evictionPolicy;

   Storage storage;
   EvictionPolicy evictionPolicy;
  // HashMapBasedStorage hashMapBasedStorage;

    public Cache(Storage storage, EvictionPolicy evictionPolicy) {
        this.evictionPolicy= evictionPolicy;
        this.storage = storage;
    }


    public void put(String key, String value)
   {
       //System.out.println(key+" " +value);
       if(!storage.isFull()) {
           System.out.println("call1");
           storage.put(key, value);
           evictionPolicy.keyAccessed(key);
           System.out.println(key + " has been inserted in cache with value " + value);
       }
        else{     String removeKey = evictionPolicy.removeKey(key);
              System.out.println("remove key: "+removeKey);
             storage.remove(removeKey);
             storage.put(key,value);
           System.out.println(key + " has been inserted in cache with value " + value);
        }

   }

   public String get(String key)
   {
      String value = storage.get(key);
      evictionPolicy.keyAccessed(key);
       System.out.println("Value "+ key);
      return value;
   }


}
