package com.estere.ecommercebackend.review;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ReviewRepository extends MongoRepository<ProductReview, String> {
    List<ProductReview> findByProductId(Long productId);
}