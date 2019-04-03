package store.ae.order.repository;

import org.springframework.stereotype.Repository;
import store.ae.order.entity.Order;

import java.util.List;

@Repository
public interface OrderRepository {

    List<Order> queryAll();
}
