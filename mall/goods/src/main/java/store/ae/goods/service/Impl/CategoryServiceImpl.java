package store.ae.goods.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.ae.goods.entity.Category;
import store.ae.goods.repository.CategoryRepository;
import store.ae.goods.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {

        return categoryRepository.queryAll();
    }
}
