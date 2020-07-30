public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void update(String message);
}
