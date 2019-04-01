package store.ae.goods.entity;

import lombok.Data;
import lombok.Generated;

import java.util.Date;

@Data
public class Category {

    private Long categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 分类
     */
    private Long categoryType;

    /**
     * 父级分类
     */
    private Long gradeType;

    /**
     * 格林时间，创建日期
     */
    private Date gmtCreate;

    private Date gmtModified;
}
