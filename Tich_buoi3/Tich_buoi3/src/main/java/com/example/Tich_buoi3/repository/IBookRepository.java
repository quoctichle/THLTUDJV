package com.example.Tich_buoi3.repository;

import com.example.Tich_buoi3.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
