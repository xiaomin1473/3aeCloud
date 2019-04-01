package store.ae.goods.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Goods implements Serializable {

    private Long goodsId;

    private Long brandId;

    private Long businessId;

    /**
     * 分类
     */
    private Long categoryType;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 总数
     */
    private Long amount;

    /**
     * 单位
     */
    private String unit;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 成交量
     */
    private Long volume;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 格林时间，创建日期
     */
    private Date gmtCreate;

    /**
     * 格林时间，修改日期
     */
    private Date gmtModified;
}
