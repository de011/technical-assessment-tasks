package com.assessment.task.service;

import com.assessment.task.dto.ProductDTO;
import com.assessment.task.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(ProductDTO productDTO);
    List<Product> getAllProducts();
}
