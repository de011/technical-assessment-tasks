package com.assessment.task.service;

import com.assessment.task.model.Product;
import com.assessment.task.model.Purchase;
import com.assessment.task.repository.ProductRepository;
import com.assessment.task.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional
    public String buyProduct(Long productId, Long userId) {

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        Purchase purchase = new Purchase();
        purchase.setProductId(productId);
        purchase.setUserId(userId);

        purchaseRepository.save(purchase);

        return "Purchase successful for product ID: " + productId + " by user ID: " + userId;
    }
}
