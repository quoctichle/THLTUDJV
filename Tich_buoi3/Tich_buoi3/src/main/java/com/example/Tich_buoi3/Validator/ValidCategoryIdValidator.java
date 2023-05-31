package com.example.Tich_buoi3.Validator;

import com.example.Tich_buoi3.Validator.annotation.ValidCategoryId;
import com.example.Tich_buoi3.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context) {
        return category!=null && category.getId()!=null;
    }
}
