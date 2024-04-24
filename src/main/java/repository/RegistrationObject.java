package repository;

import java.util.List;

public interface RegistrationObject<ID,T> {
    void add(T value);
    void update(ID key,T value);
    void delete(ID key);
    T get(ID key);
    List<T> findAll();
}
