/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnk.repository;

import com.xnk.entity.Goods;
import java.util.List;

/**
 *
 * @author user
 */
public interface GoodsRepository {
    List<Goods> findAll();
    Goods findById(String id);
    boolean insert(Goods goods);
    boolean delete(String id);
    boolean update(Goods goods);
}
