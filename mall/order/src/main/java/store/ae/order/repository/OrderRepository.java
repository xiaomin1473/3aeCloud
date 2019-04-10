package store.ae.order.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import store.ae.order.entity.Order;

import java.util.List;

@Repository
public interface OrderRepository {

    List<Order> queryAll();

    int insertOrder(@Param("order") Order order);
}
