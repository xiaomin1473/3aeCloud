package store.ae.goods.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import store.ae.goods.entity.Goods;

@Repository
public interface GoodsRepository {

    List<Goods> queryAll();


//	/**
//	 * 查询商品分类，不是查ID
//	 * @return
//	 */
//	List<Locale.Category> queryAllCategory();
//
//	/**
//	 * 查询商品品牌
//	 * @return
//	 */
//	List<Brand> queryAllBrand();
//
//	/**
//	 * @param category
//	 * 			根据分类Id
//	 * @param offset
//	 * 			偏移量
//	 * @param limit
//	 * 			范围
//	 * @return
//	 */
//	List<Goods> queryAllGoodsByCategory(@Param("categoryType") long categoryType, @Param("offset") int offset, @Param("limit") int limit);
//
//	/**
//	 * @param brandId
//	 * 			根据品牌ID
//	 * @param offset
//	 * 			偏移量
//	 * @param limit
//	 * 			范围
//	 * @return
//	 */
//	List<Goods> queryAllGoodsByBrandId(@Param("brandId") long brandId, @Param("offset") int offset, @Param("limit") int limit);
//
//
//
//	/**
//	 * 根据商品ID获取商品SPU信息
//	 * @param GoodsId
//	 * @return
//	 */
//	Goods queryGoodsSpuById(@Param("goodsId") long goodsId);
//
//	/**
//	 * 根据商品ID获取所有SKU信息
//	 * @param goodsId
//	 * @return
//	 */
//	List<GoodsSku> queryAllGoodsSkuById(@Param("goodsId") long goodsId);
//
//	/**
//	 * 根据商品ID查询商品Detail
//	 * @param goodsId
//	 * @return
//	 */
//	GoodsDetail queryGoodsDetailById(@Param("goodsId") long goodsId);
//
//	/**
//	 * 根据商品ID查询商品图片
//	 * @param goodsId
//	 * @return
//	 */
//	GoodsImage queryGoodsImageById(@Param("goodsId") long goodsId);
//
//	/**
//	 * 根据商品ID查询评价信息
//	 * @param goodsId
//	 * @return
//	 */
//	List<GoodsEvaluate> queryAllGoodsEvaluatesById(@Param("goodsId") long goodsId);
//
//
//
//	/**
//	 * 根据商品SKU ID查询SKU信息
//	 * @param goodsSkuId
//	 * @return
//	 */
//	GoodsSku queryGoodsSkuById(long goodsSkuId);
//
//
//
//	/**
//	 * @param goodsSkuId
//	 * @return
//	 * 		影响行数
//	 */
//	int reduceGoodsStore(@Param("goodsSkuId") long goodsSkuId);
}
