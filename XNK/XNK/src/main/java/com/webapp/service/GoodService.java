package com.webapp.service;

import com.webapp.entity.Good;
import com.webapp.model.GoodModel;
import java.util.List;

public interface GoodService {
    public List<Good> findAll();
    public Good findById(String id);
    public boolean insert(GoodModel goodModel);
    public boolean delete(String id);
    public  boolean update(GoodModel goodModel);
}
