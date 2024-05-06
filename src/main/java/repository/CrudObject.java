package repository;

import java.util.Collection;

public interface CrudObject<ID,T> {
    void add(T value);
    boolean delete(ID key);
    T get(ID key);
    Collection<T> findAll();
}
