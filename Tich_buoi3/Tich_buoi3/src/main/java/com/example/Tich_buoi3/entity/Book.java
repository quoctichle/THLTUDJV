package com.example.Tich_buoi3.entity;
import com.example.Tich_buoi3.Validator.annotation.ValidCategoryId;
import com.example.Tich_buoi3.Validator.annotation.ValidUserId;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.aspectj.bridge.Message;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title")
    @NotEmpty(message ="Title must not be empty")
    @Size(max = 50, min =1, message = "Title must be less than 50 characters")
    private String title;

    @Column(name="author")
    private String author;

    @Column(name="price")
    @NotNull(message = "Price is required")
    private String price;

    @ManyToOne@JoinColumn(name="category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    @ValidUserId
    private User user;

}
