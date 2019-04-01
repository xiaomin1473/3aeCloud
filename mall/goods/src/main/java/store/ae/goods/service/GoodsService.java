package store.ae.goods.service;

import store.ae.goods.entity.Goods;

import java.util.List;

public interface GoodsService {
    /**
     * 查询所有在架商品列表
     */
    List<Goods> findAll();
}
