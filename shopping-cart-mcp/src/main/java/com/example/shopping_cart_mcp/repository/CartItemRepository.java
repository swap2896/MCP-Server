package com.example.shopping_cart_mcp.repository;

import com.example.shopping_cart_mcp.entity.CartItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends MongoRepository<CartItem, String> {
    CartItem findByProductId(String productId);
    void deleteByProductId(String productId);
}
