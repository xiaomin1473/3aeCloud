package store.ae.goods.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.ae.goods.entity.Goods;
import store.ae.goods.repository.GoodsRepository;
import store.ae.goods.service.GoodsService;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsRepository goodsRepository;

    /**
     * 查询所有在架商品列表
     */
    @Override
    public List<Goods> findAll() {
        return  goodsRepository.queryAll();
    }
}
