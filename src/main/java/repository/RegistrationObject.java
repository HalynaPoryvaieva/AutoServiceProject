package repository;

import java.util.Collection;

public interface RegistrationObject<ID,T> {
    void add(T value);
    void update(ID key, T value);
    void delete(ID key);
    T get(ID key);
    Collection<T> findAll();
}
