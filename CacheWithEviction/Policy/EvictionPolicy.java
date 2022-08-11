package CacheWithEviction.Policy;

public interface EvictionPolicy {
    String keyAccessed(String key);
    String removeKey(String key);
}
