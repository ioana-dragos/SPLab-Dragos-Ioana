public interface Element {
    void print();
    default void add(Element element) {
        throw new UnsupportedOperationException("Operation not supported");
    }
    default void remove(Element element) {
        throw new UnsupportedOperationException("Operation not supported");
    }
    default Element get(int index) {
        throw new UnsupportedOperationException("Operation not supported");
    }
}