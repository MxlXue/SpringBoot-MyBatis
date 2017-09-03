package com.example.dao;


public interface BaseDao<T> {
    public void insert ( T o );

    public void update ( T o );

    public T select ( T o );
}
