package store.ae.goods.controller;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import store.ae.goods.dto.Exposer;
import store.ae.goods.entity.Category;
import store.ae.goods.entity.Goods;
import store.ae.goods.service.CategoryService;
import store.ae.goods.service.GoodsService;
import store.ae.goods.vo.GoodsInfoVo;
import store.ae.goods.vo.GoodsVo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public Exposer<GoodsVo> GoodsList() {

        // 查询所有商品
        List<Goods> goodsList = goodsService.findAll();

        // 获取类型列表
        List<Long> categoryTypeList = goodsList.stream()
                                    .map(Goods::getCategoryType)
                                    .collect(Collectors.toList());

        // 数据库查询类目
        List<Category> categoryList = categoryService.findAll();

        // 构造数据
        List<GoodsVo> goodsVoList = new ArrayList<>();

        for(Category category: categoryList) {
            GoodsVo goodsVo = new GoodsVo();

            goodsVo.setCategoryName(category.getCategoryName());
            goodsVo.setCategoryType(category.getCategoryType());

            List<GoodsInfoVo> goodsInfoVoList = new ArrayList<>();
            for(Goods goods: goodsList) {
                if(goods.getCategoryType().equals(category.getCategoryType())) {
                    GoodsInfoVo goodsInfoVo = new GoodsInfoVo();
                    BeanUtils.copyProperties(goods, goodsInfoVo);

                    goodsInfoVoList.add(goodsInfoVo);
                }
            }
            goodsVo.setGoodsInofVoList(goodsInfoVoList);

            goodsVoList.add(goodsVo);
        }

        Exposer exposer = new Exposer<>(0, "成功", goodsVoList);


        return exposer;
    }


}
