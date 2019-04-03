package store.ae.goods.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GoodsInfoVo {

    @JsonProperty("id")
    private Long goodsId;

    @JsonProperty("name")
    private String goodsName;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("volume")
    private Long volume;

    @JsonProperty("img")
    private String imgUrl;

}
