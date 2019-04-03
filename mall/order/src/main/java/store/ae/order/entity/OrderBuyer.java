package store.ae.order.entity;

import lombok.Data;

import java.util.Date;

@Data
public class OrderBuyer {

    private Long orderId;

    private Long categoryType;

    private String userName;

    private String buyerName;

    private Long buyerPhone;

    private String buyerAddress;

    private Date gmtCreate;

    private Date gmtModified;
}
