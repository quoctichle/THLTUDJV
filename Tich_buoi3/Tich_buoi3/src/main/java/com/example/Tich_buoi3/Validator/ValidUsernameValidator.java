package com.example.Tich_buoi3.Validator;

import com.example.Tich_buoi3.repository.IUserRepository;
import com.example.Tich_buoi3.Validator.annotation.ValidUsername;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUsernameValidator implements ConstraintValidator <ValidUsername, String> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context)
    {
        if(userRepository == null)
            return true;
        return userRepository.findByUserName(username) == null;
    }
}