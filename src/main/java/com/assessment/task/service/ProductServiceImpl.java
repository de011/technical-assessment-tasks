package com.assessment.task.service;

import com.assessment.task.dto.ProductDTO;
import com.assessment.task.model.Product;
import com.assessment.task.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(ProductDTO productDTO) {
        try {
            Product product = new Product();
            product.setName(productDTO.getName());
            product.setPrice(productDTO.getPrice());
            product.setDescription(productDTO.getDescription());
            return productRepository.save(product);
        } catch (Exception e) {
            throw new RuntimeException("Error while creating product: " + e.getMessage(), e);
        }
    }

            @Override
    public List<Product> getAllProducts() {
                try {
                    return productRepository.findAll();
                } catch (Exception e) {
                    throw new RuntimeException("Error while retrieving products: " + e.getMessage(), e);
                }
            }
}
