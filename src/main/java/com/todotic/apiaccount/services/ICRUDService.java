package com.todotic.apiaccount.services;

import java.util.List;

public interface ICRUDService<T, ID> {

    List<T> findAll();
    T create(T o);
}
