package com.webapp.repository;

import com.webapp.entity.Good;
import java.util.List;

public interface GoodRepository {
    List<Good> findAll();
    Good findById(String id);
    boolean insert(Good goods);
    boolean delete(String id);
    boolean update(Good goods);
}
