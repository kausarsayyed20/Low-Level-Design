package CacheWithEviction.Storage;

public interface Storage {
    public String get(String key);
    public void put(String key, String value);

    void remove(String removeKey);

    boolean isFull();
}
