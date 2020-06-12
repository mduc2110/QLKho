/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xnk.services;

import com.xnk.entity.Goods;
import com.xnk.model.GoodsModel;
import java.util.List;

/**
 *
 * @author user
 */
public interface GoodsServices {
    public List<Goods> findAll();
    public Goods findById(String id);
    public boolean insert(GoodsModel goodsViewModel);
    public boolean delete(String id);
    public boolean update(GoodsModel goodsViewModel);
}
