package store.ae.goods.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import store.ae.goods.entity.Goods;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsDaoTest {

    @Autowired
    private GoodsRepository goodsRepository;

    @Test
    public void testQueryAllGoods() {

        List<Goods> goodsList = goodsRepository.queryAll();

        Assert.assertTrue(goodsList.size() > 0);
    }
}