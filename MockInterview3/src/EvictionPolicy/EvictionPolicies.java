package EvictionPolicy;

public interface EvictionPolicies {
    public int keyAccessed(int key);
    public int removeKey(int key);

    void print();
}
