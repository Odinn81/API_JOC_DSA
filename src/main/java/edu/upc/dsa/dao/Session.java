package edu.upc.dsa.dao;

import java.util.HashMap;
import java.util.List;

public interface Session<E> {
    void save(Object entity);
    void close();
    Object get(Class theClass, int ID);
    void update(Object object, int ID);
    void delete(Object object, int ID);
    List<Object> findAll(Class theClass);
    List<Object> findAll(Class theClass, HashMap params);
    Object findOne(Class theClass, HashMap params);
    List<Object> query(String query, Class theClass, HashMap params);

    int count(Class theClass);
}
