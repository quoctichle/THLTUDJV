package com.example.Tich_buoi3.services;

import com.example.Tich_buoi3.entity.Book;
import com.example.Tich_buoi3.entity.Category;
import com.example.Tich_buoi3.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    public List<Category> getAllCategories(){return categoryRepository.findAll();}
    public Category getCategoryById(Long id){return categoryRepository.findById(id).orElse(null);}
    public void addCategory(Category category)
    {
        categoryRepository.save(category);
    }

    public void update(Category category)
    {
        categoryRepository.save(category);
    }
    public Category saveCategory(Category category){return categoryRepository.save(category);}
    public void deleteCategory(Long id){categoryRepository.deleteById(id);}
}
