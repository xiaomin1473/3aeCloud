package store.ae.goods.vo;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class GoodsVo {

    @SerializedName("name")
    private  String categoryName;


}
