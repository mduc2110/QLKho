package com.webapp.service;

import com.webapp.entity.Good;
import com.webapp.model.GoodModel;
import com.webapp.repository.GoodRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GoodSeviceImpl implements GoodService{
    
    @Autowired
    GoodRepository gRep;
    
    public List<Good> findAll() {
        return gRep.findAll();
    }

    public Good findById(String id) {
        return gRep.findById(id);
    }

    public boolean insert(GoodModel goodsViewModel) {
        try{
            Good g = new Good();
            g.setId(goodsViewModel.getId());
            g.setName(goodsViewModel.getName());
            g.setQuantity(goodsViewModel.getQuantity());
            g.setPrice(goodsViewModel.getPrice());
            return gRep.insert(g);
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(String id) {
        return gRep.delete(id);
    }

	public boolean update(GoodModel goodsViewModel) {
		try{
            Good g = gRep.findById(goodsViewModel.getId());
            g.setName(goodsViewModel.getName());
            g.setQuantity(goodsViewModel.getQuantity());
            g.setPrice(goodsViewModel.getPrice());
            return gRep.insert(g);
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
	}

    
}
