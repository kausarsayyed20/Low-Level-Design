package Storage;

public interface Storage {
    public String get(int key);
    void put(int key, String value);

    boolean isFull();

    void remove(Integer key);
    void print();
}
