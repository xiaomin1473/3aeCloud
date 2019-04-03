package store.ae.goods.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class GoodsVo {

    @JsonProperty("name")
    private  String categoryName;

    @JsonProperty("type")
    private Long categoryType;

    @JsonProperty("Goods")
    List<GoodsInfoVo> goodsInofVoList;
}
