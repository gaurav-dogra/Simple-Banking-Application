package banking.dao;


public interface DAO<T> {
    void add(T element);

    T findByNumber(String number);

}
