package com.assessment.task.controller;

import com.assessment.task.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("/buy/{productId}")
    public ResponseEntity<String> buyProduct(@PathVariable Long productId, @RequestHeader Long userId) {
        String purchaseResponse = purchaseService.buyProduct(productId, userId);

        if (purchaseResponse.equals("Purchase successful")) {
            return ResponseEntity.status(HttpStatus.CREATED).body(purchaseResponse);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(purchaseResponse);
        }
    }

}
