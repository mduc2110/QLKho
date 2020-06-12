/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.xnk.entity.Goods;
import com.xnk.model.GoodsModel;
import com.xnk.repository.GoodsRepository;
import com.xnk.services.GoodsServices;
import java.util.List;
import java.util.UUID;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
public class GoodsServicesImpl implements GoodsServices{
    @Autowired
    GoodsRepository gRep;
    
    public List<Goods> findAll() {
        return gRep.findAll();
    }

    public Goods findById(String id) {
        return gRep.findById(id);
    }

    public boolean insert(GoodsModel goodsViewModel) {
        try{
            Goods g = new Goods();
            g.setId(UUID.randomUUID().toString());
            g.setName(goodsViewModel.getName());
            g.setQuantity(goodsViewModel.getQuantity());
            g.setPrice(goodsViewModel.getQuantity());
            return gRep.insert(g);
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(GoodsModel goodsViewModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
