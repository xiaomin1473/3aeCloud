package store.ae.order.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderGoods {

    private Long orderId;

    private Long goodsSkuId;

    private Long categoryType;

    private String goodsName;

    private Integer goodsNumber;

    private String unit;

    private BigDecimal skuPrice;

    private String imgUrl;

    private Date gmtCreate;

    private Date gmtModified;
}
