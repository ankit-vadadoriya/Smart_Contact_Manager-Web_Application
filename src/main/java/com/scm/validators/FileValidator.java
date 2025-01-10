package com.scm.validators;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FileValidator implements ConstraintValidator<ValidFile, MultipartFile> {
    // for file size
    private static final long MAX_FILE_SIZE = 1024 * 1024 * 2;  // 2 MB

    // for file type


    // for file height


    // for file width

    // for file extenstions
    private static final String ALLOWED_EXTENSIONS = "png|jpg|jpeg";

    @Override
    public boolean isValid(MultipartFile file, ConstraintValidatorContext context) {
        
        if (file == null || file.isEmpty()) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("File cannot be empty").addConstraintViolation();
            return true;
        }

        if (file.getSize() > MAX_FILE_SIZE) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("File size should be less than 2MB").addConstraintViolation();
            return false;
        }

        String fileName = file.getOriginalFilename();
        if (fileName != null && !fileName.isEmpty()) {
            String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
            if (!fileExtension.matches(ALLOWED_EXTENSIONS)) {
                context.disableDefaultConstraintViolation();
                context.buildConstraintViolationWithTemplate("Invalid file type. Only PNG, JPG, and JPEG are allowed.").addConstraintViolation();
                return false;
            }
        } else {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("File name is invalid").addConstraintViolation();
            return false;
        }
        
        return true;

    }

}
