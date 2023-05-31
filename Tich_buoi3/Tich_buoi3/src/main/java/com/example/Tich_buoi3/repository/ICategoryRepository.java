package com.example.Tich_buoi3.repository;

import com.example.Tich_buoi3.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Long> {

}
