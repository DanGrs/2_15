public interface List {
    void add(Integer elem);

    void add(int index, Integer elem);

    void set(int index, Integer elem);

    Integer remove(int index);

    Integer get(int index);

    int size();

    void clear();

    boolean isEmpty();

    int indexOf(Integer elem);

    int lastIndexOf(Integer elem);

    boolean contains(Integer elem);
}
