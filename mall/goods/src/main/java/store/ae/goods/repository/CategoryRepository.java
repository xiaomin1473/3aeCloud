package store.ae.goods.repository;

import org.springframework.stereotype.Repository;
import store.ae.goods.entity.Category;

import java.util.List;

@Repository
public interface CategoryRepository {

    List<Category> queryAll();

    List<Category> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
